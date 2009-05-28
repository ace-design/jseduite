/**
 * This file is part of jSeduite::BreakTimeManager
 *
 * Copyright (C) 2008-  Sebastien Mosser
 *
 * jSeduite::Twitter is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * jSeduite::Twitter is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with jSeduite::InternalNews; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 *
 * @author      Zhao Yichen         [yichenzhao18@gmail.com]
   @author      Qin Zhaobo          [Bienvenueqin@gmail.com]
 **/

package cn.m1.hebut.jSeduite.technical.twitter.admin;

import fr.unice.i3s.modalis.jSeduite.libraries.mysql.DalResultSet;

/**
 *
 * @author      Zhao Yichen         [yichenzhao18@gmail.com]
   @author      Qin Zhaobo          [Bienvenueqin@gmail.com]
 */
public class User {
    String studentId;
    String twitterName;
    boolean status;

    public User() {
    }

    public User(String studentId, String twitterName, boolean status) {
        this.studentId = studentId;
        this.twitterName = twitterName;
        this.status = status;
    }

    public User(DalResultSet rset) {
        this.studentId=rset.getValue("student_id");
        this.twitterName=rset.getValue("twitter_account");
        this.status=rset.getValue("status").equalsIgnoreCase("free");
    }
    

}