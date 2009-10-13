/*
 * Copyright (C) 2009 eXo Platform SAS.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.exoplatform.services.rest.impl;

import org.exoplatform.services.rest.DependencyInjector;

import java.lang.reflect.Type;
import java.util.HashMap;

/**
 * @author <a href="mailto:andrey.parfonov@exoplatform.com">Andrey Parfonov</a>
 * @version $Id: SimpleDependencyInjector.java 275 2009-10-13 16:17:02Z aparfonov $
 */
public class SimpleDependencyInjector extends HashMap<Class<?>, Object> implements DependencyInjector
{

   private static final long serialVersionUID = 8212609178539168377L;

   public Object getInjectableParameter(Class<?> type, Type genericType)
   {
      return get(type);
   }

}