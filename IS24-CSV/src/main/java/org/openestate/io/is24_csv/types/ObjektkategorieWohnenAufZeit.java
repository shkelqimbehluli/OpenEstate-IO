/*
 * Copyright 2015-2016 OpenEstate.org.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openestate.io.is24_csv.types;

import org.apache.commons.lang3.StringUtils;

/**
 * ObjektkategorieWohnenAufZeit.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public enum ObjektkategorieWohnenAufZeit
{
  ZIMMER( 0 ),
  APPARTMENT( 1 ),
  WOHNUNG( 2 ),
  HAUS( 3 );

  private final int value;

  private ObjektkategorieWohnenAufZeit( int value )
  {
    this.value = value;
  }

  public static ObjektkategorieWohnenAufZeit parse( String value )
  {
    value = StringUtils.trimToNull( value );
    if (value==null) return null;
    for (ObjektkategorieWohnenAufZeit s : ObjektkategorieWohnenAufZeit.values())
    {
      if (String.valueOf( s.value ).equalsIgnoreCase( value )) return s;
    }
    return null;
  }

  public String print()
  {
    return String.valueOf( this.value );
  }
}