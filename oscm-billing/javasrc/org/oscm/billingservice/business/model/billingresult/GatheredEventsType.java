/*******************************************************************************
 *  Copyright FUJITSU LIMITED 2015 
 *******************************************************************************/

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.03.05 at 01:29:11 PM CET 
//


package org.oscm.billingservice.business.model.billingresult;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Chargeable events that occurred during the usage of the subscription.
 * 
 * <p>Java class for GatheredEventsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GatheredEventsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Event" type="{}EventType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GatheredEventsCosts" type="{}NormalizedCostsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GatheredEventsType", propOrder = {
    "event",
    "gatheredEventsCosts"
})
public class GatheredEventsType {

    @XmlElement(name = "Event")
    protected List<EventType> event;
    @XmlElement(name = "GatheredEventsCosts", required = true)
    protected NormalizedCostsType gatheredEventsCosts;

    /**
     * Gets the value of the event property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the event property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventType }
     * 
     * 
     */
    public List<EventType> getEvent() {
        if (event == null) {
            event = new ArrayList<EventType>();
        }
        return this.event;
    }

    /**
     * Gets the value of the gatheredEventsCosts property.
     * 
     * @return
     *     possible object is
     *     {@link NormalizedCostsType }
     *     
     */
    public NormalizedCostsType getGatheredEventsCosts() {
        return gatheredEventsCosts;
    }

    /**
     * Sets the value of the gatheredEventsCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link NormalizedCostsType }
     *     
     */
    public void setGatheredEventsCosts(NormalizedCostsType value) {
        this.gatheredEventsCosts = value;
    }

}
