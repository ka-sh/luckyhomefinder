package com.hyperlap.luckhomefinder.crawlers.domain;

import java.util.Date;

/**
 * Property holds all property information that will be used later to be
 * presented to the user.
 * 
 * @author Kareem Elshahawe
 * */
/***/
public final class Property {

	/** property Id on database */
	// uuid
	/** property Id on the website */
	private String SiteId;
	/** holds the street address and building number */
	private String streetAddress;
	/** holds the district name */
	private String district;
	/** holds the property location */
	private Locations location;
	/** Date at which ad was posted */
	private Date postDate;
	/** holds the cost of renting the property */
	private long rent;
	/** holds the cost of buying the property */
	private long sell;
	/** Holds the property space in feet */
	private int feets;
	/** Holds the property Type */
	private PropertyType propertyType;
	/** Represent wither this property is advertised by an agency or not */
	private boolean Agent;
	/** Represent wither this property is advertised by an agency or not */
	private boolean owner;
	/** Contain the property link. */
	private String link;
	/** Boolean to indicate wither property for rent or not */
	private boolean rentStatus;
	/** Boolean to indicate wither property for sale or not */
	private boolean saleStatus;

	/**
	 * Return rent status of the property
	 * 
	 * @return wither property for rent or not
	 */
	public final boolean isForRent() {
		return rentStatus;
	}

	/**
	 * Sets the property rent status
	 * 
	 * @param rentStatus
	 *            indicates the property rent status.
	 */
	public void setRentStatus(final boolean rentStatus) {
		this.rentStatus = rentStatus;
	}

	/**
	 * Return sale status of the property
	 * 
	 * @return wither property for sale or not.
	 */
	public final boolean isForSale() {
		return saleStatus;
	}

	/**
	 * Sets the sale status of the property
	 * 
	 * @param saleStatus
	 *            Indicates the property sale status.
	 */
	public void setSellingStatus(final boolean saleStatus) {
		this.saleStatus = saleStatus;
	}

	/**
	 * Return the property id on the website.
	 * 
	 * @return property id on the website.
	 * */
	public final String getSiteId() {
		return SiteId;
	}

	/**
	 * Sets the property id on the website.
	 * 
	 * @param siteId
	 *            property id on the website.
	 * */
	public void setSiteId(final String siteId) {
		SiteId = siteId;
	}

	/**
	 * Return the property link
	 * 
	 * @return property link
	 * */
	public String getLink() {
		return link;
	}

	/**
	 * Sets the property link.
	 * 
	 * @param propertyLink
	 *            property link.
	 * */
	public void setLink(final String propertyLink) {
		this.link = propertyLink;
	}

	/**
	 * Return the street address
	 * 
	 * @return street address
	 */
	public final String getStreetAddress() {
		return streetAddress;
	}

	/**
	 * Set the Street Address
	 * 
	 * @param streetAddress
	 *            street address.
	 * */
	public final void setStreetAddress(final String streetAddress) {
		this.streetAddress = streetAddress;
	}

	/**
	 * Return District
	 * 
	 * @return district location
	 * */
	public final String getDistrict() {
		return district;
	}

	/**
	 * Set district locations
	 * 
	 * @param district
	 *            district location
	 * */

	public final void setDistrict(final String district) {
		this.district = district;
	}

	/**
	 * Return location
	 * 
	 * @return location
	 * */
	public final Locations getLocation() {
		return location;
	}

	/**
	 * Set location
	 * 
	 * @param location
	 * */
	public final void setLocation(final Locations location) {
		this.location = location;
	}

	/**
	 * Return the date when the ad was posted.
	 * 
	 * @return date of the ad
	 * */
	public final Date getPostDate() {
		return postDate;
	}

	/**
	 * Set the date of the ad
	 * 
	 * @param postDate
	 *            date when the ad was posted
	 * */
	public final void setPostDate(Date postDate) {
		this.postDate = postDate;
	}

	/**
	 * Return cost of the rent.
	 * 
	 * @return rent cost of the property
	 * */
	public final long getRent() {
		return rent;
	}

	/**
	 * Sets the rent cost of the property
	 * 
	 * @param rent
	 *            rent cost of the property
	 * */
	public final void setRent(final long rent) {
		this.rent = rent;
	}

	/**
	 * Return the selling cost of the property.
	 * 
	 * @return selling cost of the property
	 * */
	public final long getSell() {
		return sell;
	}

	/**
	 * Set selling price of the property
	 * 
	 * @param sell
	 *            cost of the selling price
	 * */
	public final void setSellintPrice(final long sell) {
		this.sell = sell;
	}

	/**
	 * Return size of the property in feets
	 * 
	 * @return property size in feets
	 * */
	public final int getFeets() {
		return feets;
	}

	/**
	 * Sets the property size in feets
	 * 
	 * @param feets
	 *            property size in feet
	 * */
	public final void setFeets(final int feets) {
		this.feets = feets;
	}

	/**
	 * Return the type of the property
	 * 
	 * @return property type
	 * */
	public final PropertyType getPropertyType() {
		return propertyType;
	}

	/**
	 * Set the property type
	 * 
	 * @param propertyType
	 *            type of the property
	 * */
	public final void setPropertyType(PropertyType propertyType) {
		this.propertyType = propertyType;
	}

	/**
	 * Return wither ad was posted by an Agency or not
	 * 
	 * @return wither ad was posted by an agency or not
	 * */
	public final boolean isAgent() {
		return Agent;
	}

	/**
	 * Sets wither ad was posted by an Agency or not
	 * 
	 * @param agent
	 *            sets wither ad was posted by an agent or not.
	 * */
	public final void setAgent(final boolean agent) {
		Agent = agent;
	}

	/**
	 * Return wither ad was posted by the property owner or not
	 * 
	 * @return wither ad was posted by the property owner or not
	 * */
	public final boolean isOwner() {
		return owner;
	}

	/**
	 * Set wither ad was posted by the property owner or not
	 * 
	 * @Param owner wither ad was posted by the property owner or not
	 * */

	public final void setOwner(boolean owner) {
		this.owner = owner;
	}

}
