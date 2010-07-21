/**
 * This file is part of jSeduite::util
 *
 * Copyright (C) 2008-  Sebastien Mosser
 *
 * jSeduite::util is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * jSeduite::util is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with jSeduite::util; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 *
 * @author      Main     Christophe Desclaux    [desclaux@polytech.unice.fr]
 **/

var menus = Class.create(jSeduiteTransformation, {
        perform: function(xml) {
        var content = "";
        content += "<div id=\"menus_logo\" class=\"menus_logo\"></div>";
        content += "<p class=\"title\"> &nbsp; ";
        content += getTag("title", xml) + "</p>";
        content += "<div class=\"clearDiv\">&nbsp;</div>";
        content += "<p class=\"internal_content\">" +  getTag("content", xml) + "</p>"
        content += "<span class=\"internal_author\">" + getTag("author", xml) + "</span>";
        var stampIN = getTag("start", xml);
        content += "<span class=\"internal_date\">";
        content += " ("+stampIN.substring(8,10)+"/"+stampIN.substring(5,7)+")";
        content += "</span>";
        return [content];
    }
});