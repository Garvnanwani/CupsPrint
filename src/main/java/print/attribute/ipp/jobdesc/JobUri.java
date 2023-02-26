/**
 * Copyright (C) 2003 <a href="http://www.lohndirekt.de/">lohndirekt.de</a>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 */
package print.attribute.ipp.jobdesc;

import java.net.URI;

import javax.print.attribute.PrintJobAttribute;
import javax.print.attribute.PrintRequestAttribute;
import javax.print.attribute.URISyntax;


public class JobUri extends URISyntax implements PrintRequestAttribute, PrintJobAttribute {

	/**
	 * @param uri
	 */
	public JobUri(URI uri) {
		super(uri);
	}

	/**
	 *
	 */
	public Class getCategory() {
		return this.getClass();
	}

	/**
	 *
	 */
	public String getName() {
		return JobUri.getIppName();
	}

	public static String getIppName(){
		return "job-uri";
	}

}
