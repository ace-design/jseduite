/**
 * This file is part of jSeduite::HyperMachin
 *
 * Copyright (C) 2008-  Sebastien Mosser
 *
 * jSeduite::HyperMachin is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * jSeduite::HyperMachin is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with jSeduite::HyperMachin; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 *
 * @author      Main   Sébastien Mosser          [mosser@polytech.unice.fr]
 * @contributor [2009] Claudine Peyrat           [claudine@polytech.unice.fr]
 *
 **/

package impl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import data.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import net.fortuna.ical4j.model.DateTime;
import net.fortuna.ical4j.model.Dur;
import net.fortuna.ical4j.model.Period;
import util.HyperCache;
import util.HyperCacheStatus;
import util.HyperEventBuilder;

/**
 *
 * @author mosser
 */
@WebService()
public class HyperLocator {

    @WebMethod(operationName = "getAllPromo")
    public HyperLocation[] getAllPromo()
            throws HyperException {
        ArrayList<HyperLocation> result = new ArrayList<HyperLocation>();
        try {
            for(String id: HyperCache.getCacheContent())
                result.addAll(Arrays.asList(getByPromo(id)));
        } catch(Exception e) {throw new HyperException(e.getMessage()); }
        return result.toArray(new HyperLocation[result.size()]);
    }

    @WebMethod(operationName = "getByPromo")
    public HyperLocation[] getByPromo(@WebParam(name="id") String id)
            throws HyperException {
        ArrayList<HyperLocation> result = new ArrayList<HyperLocation>();
        Period r = getNowPeriod();
        try {
            HyperCache c = new HyperCache(id);
            if (c.isValid() == HyperCacheStatus.VALID) {
                HyperPromo p = c.localize();
                HyperEventBuilder builder = new HyperEventBuilder(p,r);
                builder.transform();
                for(HyperEvent event: builder.getResult()) {
                    result.addAll(Arrays.asList(HyperLocation.build(event)));
                 }
            }
        } catch(Exception e) { throw new HyperException(e.getMessage()); }
        return result.toArray(new HyperLocation[result.size()]);
    }
    /**
     * Web service operation
     */
    @WebMethod(operationName = "getAllPromoByBuilding")
    public HyperLocation[] getAllPromoByBuilding(
            @WebParam(name = "building") String building)
            throws HyperException {
        ArrayList<HyperLocation> result = new ArrayList<HyperLocation>();
        for(HyperLocation loc: getAllPromo()) {
            if (loc.getBuilding().equals(building))
                result.add(loc);
        }
        return  result.toArray(new HyperLocation[result.size()]);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "locateTeacher")
    public HyperLocation[] locateTeacher(@WebParam(name = "name") String name)
            throws HyperException {
        ArrayList<HyperLocation> result = new ArrayList<HyperLocation>();
        for(HyperLocation loc: getAllPromo()) {
            if (loc.getTeacher().endsWith(name))
                result.add(loc);
        }
        return  result.toArray(new HyperLocation[result.size()]);
    }

    /** private methods **/
    private Period getNowPeriod() {
        java.util.Calendar now = java.util.Calendar.getInstance();
        //now.set(java.util.Calendar.HOUR_OF_DAY, 0);
        //now.clear(java.util.Calendar.MINUTE);
        //now.clear(java.util.Calendar.SECOND);
        Period r = new Period(new DateTime(now.getTime()), new Dur(0,0,0,0));
        return  r;
    }

}
