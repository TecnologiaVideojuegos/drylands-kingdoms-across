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
import javax.xml.bind.annotation.XmlType;


/**
 * While tile layers are very suitable for anything repetitive<br>
 * aligned to the tile grid, sometimes you want to annotate your<br>
 * map with other information, not necessarily aligned to the grid.<br>
 * Hence the objects have their coordinates and size in pixels, but<br>
 * you can still easily align that to the grid when you want to.<br>
 * <br>
 * You generally use objects to add custom information to your tile<br>
 * map, such as spawn points, warps, exits, etc.<br>
 * <br>
 * When the object has a `gid` set, then it is represented by the<br>
 * image of the tile with that global ID. The image alignment<br>
 * currently depends on the map orientation. In orthogonal<br>
 * orientation it's aligned to the bottom-left while in isometric<br>
 * it's aligned to the bottom-center.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Object", propOrder = {
    "properties",
    "ellipse",
    "polygon",
    "polyline",
    "text",
    "image"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
public class MapObjectData {

    /**
     * 
     */
    @XmlElement(required = true, type = Properties.class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected Properties properties;
    /**
     * @since 0.9
     * 
     */
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected Ellipse ellipse;
    /**
     * 
     */
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected Polygon polygon;
    /**
     * 
     */
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected Polyline polyline;
    /**
     * @since 1.0
     * 
     */
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected Text text;
    /**
     * 
     */
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected ImageData image;
    /**
     * Unique ID of the object. Each object that is placed on a map<br>
     * gets a unique id. Even if an object was deleted, no object<br>
     * gets the same ID. Can not be changed in Tiled Qt.<br>
     * <br>
     * @since 0.11
     * 
     */
    @XmlAttribute(name = "id")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected Integer id;
    /**
     * The name of the object. An arbitrary string.
     * 
     */
    @XmlAttribute(name = "name")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected String name;
    /**
     * The type of the object. An arbitrary string.
     * 
     */
    @XmlAttribute(name = "type")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected String type;
    /**
     * The x coordinate of the object in pixels.
     * 
     */
    @XmlAttribute(name = "x", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected double x;
    /**
     * The y coordinate of the object in pixels.
     * 
     */
    @XmlAttribute(name = "y", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected double y;
    /**
     * The width of the object in pixels (defaults to 0).
     * 
     */
    @XmlAttribute(name = "width")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected Double width;
    /**
     * The height of the object in pixels (defaults to 0).
     * 
     */
    @XmlAttribute(name = "height")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected Double height;
    /**
     * The rotation of the object in degrees clockwise (defaults to<br>
     *  0).<br>
     * <br>
     * @since 0.10
     * 
     */
    @XmlAttribute(name = "rotation", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected double rotation;
    /**
     * An reference to a tile (optional).
     * 
     */
    @XmlAttribute(name = "gid")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected Integer gid;
    /**
     * Whether the object is shown (1) or hidden (0). Defaults to<br>
     *  1.<br>
     * <br>
     * @since 0.9
     * 
     */
    @XmlAttribute(name = "visible")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean visible;

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
     * @since 0.9
     * 
     * @return
     *     possible object is
     *     {@link Ellipse }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public Ellipse getEllipse() {
        return ellipse;
    }

    /**
     * @since 0.9
     * 
     * @param value
     *     allowed object is
     *     {@link Ellipse }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setEllipse(Ellipse value) {
        this.ellipse = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link Polygon }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public Polygon getPolygon() {
        return polygon;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link Polygon }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setPolygon(Polygon value) {
        this.polygon = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link Polyline }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public Polyline getPolyline() {
        return polyline;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link Polyline }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setPolyline(Polyline value) {
        this.polyline = value;
    }

    /**
     * @since 1.0
     * 
     * @return
     *     possible object is
     *     {@link Text }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public Text getText() {
        return text;
    }

    /**
     * @since 1.0
     * 
     * @param value
     *     allowed object is
     *     {@link Text }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setText(Text value) {
        this.text = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link ImageData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public ImageData getImage() {
        return image;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link ImageData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setImage(ImageData value) {
        this.image = value;
    }

    /**
     * Unique ID of the object. Each object that is placed on a map<br>
     * gets a unique id. Even if an object was deleted, no object<br>
     * gets the same ID. Can not be changed in Tiled Qt.<br>
     * <br>
     * @since 0.11
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public Integer getId() {
        return id;
    }

    /**
     * Unique ID of the object. Each object that is placed on a map<br>
     * gets a unique id. Even if an object was deleted, no object<br>
     * gets the same ID. Can not be changed in Tiled Qt.<br>
     * <br>
     * @since 0.11
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * The name of the object. An arbitrary string.
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
     * The name of the object. An arbitrary string.
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
     * The type of the object. An arbitrary string.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public String getType() {
        return type;
    }

    /**
     * The type of the object. An arbitrary string.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setType(String value) {
        this.type = value;
    }

    /**
     * The x coordinate of the object in pixels.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public double getX() {
        return x;
    }

    /**
     * The x coordinate of the object in pixels.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setX(double value) {
        this.x = value;
    }

    /**
     * The y coordinate of the object in pixels.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public double getY() {
        return y;
    }

    /**
     * The y coordinate of the object in pixels.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setY(double value) {
        this.y = value;
    }

    /**
     * The width of the object in pixels (defaults to 0).
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public Double getWidth() {
        return width;
    }

    /**
     * The width of the object in pixels (defaults to 0).
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setWidth(Double value) {
        this.width = value;
    }

    /**
     * The height of the object in pixels (defaults to 0).
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public Double getHeight() {
        return height;
    }

    /**
     * The height of the object in pixels (defaults to 0).
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setHeight(Double value) {
        this.height = value;
    }

    /**
     * The rotation of the object in degrees clockwise (defaults to<br>
     *  0).<br>
     * <br>
     * @since 0.10
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public double getRotation() {
        return rotation;
    }

    /**
     * The rotation of the object in degrees clockwise (defaults to<br>
     *  0).<br>
     * <br>
     * @since 0.10
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setRotation(double value) {
        this.rotation = value;
    }

    /**
     * An reference to a tile (optional).
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public Integer getGid() {
        return gid;
    }

    /**
     * An reference to a tile (optional).
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setGid(Integer value) {
        this.gid = value;
    }

    /**
     * Whether the object is shown (1) or hidden (0). Defaults to<br>
     *  1.<br>
     * <br>
     * @since 0.9
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
     * Whether the object is shown (1) or hidden (0). Defaults to<br>
     *  1.<br>
     * <br>
     * @since 0.9
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

}
