/*-
 * #%L
 * libtiled
 * %%
 * Copyright (C) 2004 - 2018 Thorbj?rn Lindeijer <thorbjorn@lindeijer.nl>
 * %%
 * Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are met:

1. Redistributions of source code must retain the above copyright notice,
   this list of conditions and the following disclaimer.
2. Redistributions in binary form must reproduce the above copyright notice,
   this list of conditions and the following disclaimer in the documentation
   and/or other materials provided with the distribution.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
POSSIBILITY OF SUCH DAMAGE.
 * #L%
 */
//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci?n de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder?n si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.04.16 a las 09:35:28 PM CEST 
//


package org.mapeditor.core;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Layer", propOrder = {
    "properties"
})
@XmlSeeAlso({
    ImageLayer.class,
    ObjectGroup.class,
    TileLayer.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
public abstract class LayerData {

    /**
     * 
     */
    @XmlElement(type = Properties.class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected Properties properties;
    /**
     * The name of the layer.
     * 
     */
    @XmlAttribute(name = "name", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected String name;
    /**
     * The x coordinate of the layer in tiles. Defaults to 0 and<br>
     * can no longer be changed in Tiled Qt.<br>
     * <br>
     * @deprecated
     * 
     */
    @XmlAttribute(name = "x")
    @Deprecated
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected Integer x;
    /**
     * The y coordinate of the layer in tiles. Defaults to 0 and<br>
     * can no longer be changed in Tiled Qt.<br>
     * <br>
     * @deprecated
     * 
     */
    @XmlAttribute(name = "y")
    @Deprecated
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected Integer y;
    /**
     * The width of the layer in tiles. Traditionally required, but<br>
     * as of Tiled Qt always the same as the map width.<br>
     * <br>
     * @deprecated
     * 
     */
    @XmlAttribute(name = "width", required = true)
    @Deprecated
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected int width;
    /**
     * The height of the layer in tiles. Traditionally required,<br>
     * but as of Tiled Qt always the same as the map height.<br>
     * <br>
     * @deprecated
     * 
     */
    @XmlAttribute(name = "height", required = true)
    @Deprecated
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected int height;
    /**
     * The opacity of the layer as a value from 0 to 1. Defaults to<br>
     *  1.
     * 
     */
    @XmlAttribute(name = "opacity")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected Float opacity;
    /**
     * Whether the layer is shown (1) or hidden (0). Defaults to 1.
     * 
     */
    @XmlAttribute(name = "visible")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean visible;
    /**
     * Rendering offset for this layer in pixels. Defaults to 0.<br>
     * <br>
     * @since 0.14
     * 
     */
    @XmlAttribute(name = "offsetx")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected Integer offsetX;
    /**
     * Rendering offset for this layer in pixels. Defaults to 0.<br>
     * <br>
     * @since 0.14
     * 
     */
    @XmlAttribute(name = "offsety")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected Integer offsetY;

    /**
     * 
     * @return
     *     possible object is
     *     {@link PropertiesData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public Properties getProperties() {
        return properties;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link PropertiesData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setProperties(Properties value) {
        this.properties = value;
    }

    /**
     * The name of the layer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public String getName() {
        return name;
    }

    /**
     * The name of the layer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setName(String value) {
        this.name = value;
    }

    /**
     * The x coordinate of the layer in tiles. Defaults to 0 and<br>
     * can no longer be changed in Tiled Qt.<br>
     * <br>
     * @deprecated
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Deprecated
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public Integer getX() {
        return x;
    }

    /**
     * The x coordinate of the layer in tiles. Defaults to 0 and<br>
     * can no longer be changed in Tiled Qt.<br>
     * <br>
     * @deprecated
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Deprecated
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setX(Integer value) {
        this.x = value;
    }

    /**
     * The y coordinate of the layer in tiles. Defaults to 0 and<br>
     * can no longer be changed in Tiled Qt.<br>
     * <br>
     * @deprecated
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Deprecated
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public Integer getY() {
        return y;
    }

    /**
     * The y coordinate of the layer in tiles. Defaults to 0 and<br>
     * can no longer be changed in Tiled Qt.<br>
     * <br>
     * @deprecated
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Deprecated
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setY(Integer value) {
        this.y = value;
    }

    /**
     * The width of the layer in tiles. Traditionally required, but<br>
     * as of Tiled Qt always the same as the map width.<br>
     * <br>
     * @deprecated
     * 
     */
    @Deprecated
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public int getWidth() {
        return width;
    }

    /**
     * The width of the layer in tiles. Traditionally required, but<br>
     * as of Tiled Qt always the same as the map width.<br>
     * <br>
     * @deprecated
     * 
     */
    @Deprecated
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setWidth(int value) {
        this.width = value;
    }

    /**
     * The height of the layer in tiles. Traditionally required,<br>
     * but as of Tiled Qt always the same as the map height.<br>
     * <br>
     * @deprecated
     * 
     */
    @Deprecated
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public int getHeight() {
        return height;
    }

    /**
     * The height of the layer in tiles. Traditionally required,<br>
     * but as of Tiled Qt always the same as the map height.<br>
     * <br>
     * @deprecated
     * 
     */
    @Deprecated
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setHeight(int value) {
        this.height = value;
    }

    /**
     * The opacity of the layer as a value from 0 to 1. Defaults to<br>
     *  1.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public Float getOpacity() {
        return opacity;
    }

    /**
     * The opacity of the layer as a value from 0 to 1. Defaults to<br>
     *  1.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setOpacity(Float value) {
        this.opacity = value;
    }

    /**
     * Whether the layer is shown (1) or hidden (0). Defaults to 1.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public Boolean isVisible() {
        return visible;
    }

    /**
     * Whether the layer is shown (1) or hidden (0). Defaults to 1.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setVisible(Boolean value) {
        this.visible = value;
    }

    /**
     * Rendering offset for this layer in pixels. Defaults to 0.<br>
     * <br>
     * @since 0.14
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public Integer getOffsetX() {
        return offsetX;
    }

    /**
     * Rendering offset for this layer in pixels. Defaults to 0.<br>
     * <br>
     * @since 0.14
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setOffsetX(Integer value) {
        this.offsetX = value;
    }

    /**
     * Rendering offset for this layer in pixels. Defaults to 0.<br>
     * <br>
     * @since 0.14
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public Integer getOffsetY() {
        return offsetY;
    }

    /**
     * Rendering offset for this layer in pixels. Defaults to 0.<br>
     * <br>
     * @since 0.14
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setOffsetY(Integer value) {
        this.offsetY = value;
    }

}
