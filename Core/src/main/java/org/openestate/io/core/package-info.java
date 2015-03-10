/*
 * Copyright 2015 OpenEstate.org.
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

/**
 * General classes for OpenEstate-IO.
 *
 *
 * <h3>CSV processing</h3>
 *
 * The classes
 * {@link org.openestate.io.core.CsvFormat},
 * {@link org.openestate.io.core.CsvParser},
 * {@link org.openestate.io.core.CsvPrinter},
 * {@link org.openestate.io.core.CsvRecord}
 * provide a thin layer over
 * <a href="http://commons.apache.org/proper/commons-csv/">commons-csv</a> for
 * processing of CSV files.
 *
 *
 * <h3>XML processing</h3>
 *
 * The classes
 * {@link org.openestate.io.core.XmlDocument},
 * {@link org.openestate.io.core.XmlUtils}
 * provide a general mapping between Java objects (generated by JAXB) and a XML
 * DOM tree ({@link org.w3c.dom.Document}).
 *
 *
 * <h3>XML versioning</h3>
 *
 * The classes
 * {@link org.openestate.io.core.XmlConvertableDocument},
 * {@link org.openestate.io.core.XmlConverter},
 * {@link org.openestate.io.core.XmlVersion}
 * provide general functions for upgrading / downgrading XML documents through
 * manipulation of the DOM tree ({@link org.w3c.dom.Document}).
 *
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
package org.openestate.io.core;
