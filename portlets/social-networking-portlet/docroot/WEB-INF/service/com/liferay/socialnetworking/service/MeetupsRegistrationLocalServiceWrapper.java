/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.socialnetworking.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link MeetupsRegistrationLocalService}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       MeetupsRegistrationLocalService
 * @generated
 */
public class MeetupsRegistrationLocalServiceWrapper
	implements MeetupsRegistrationLocalService,
		ServiceWrapper<MeetupsRegistrationLocalService> {
	public MeetupsRegistrationLocalServiceWrapper(
		MeetupsRegistrationLocalService meetupsRegistrationLocalService) {
		_meetupsRegistrationLocalService = meetupsRegistrationLocalService;
	}

	/**
	* Adds the meetups registration to the database. Also notifies the appropriate model listeners.
	*
	* @param meetupsRegistration the meetups registration
	* @return the meetups registration that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.socialnetworking.model.MeetupsRegistration addMeetupsRegistration(
		com.liferay.socialnetworking.model.MeetupsRegistration meetupsRegistration)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _meetupsRegistrationLocalService.addMeetupsRegistration(meetupsRegistration);
	}

	/**
	* Creates a new meetups registration with the primary key. Does not add the meetups registration to the database.
	*
	* @param meetupsRegistrationId the primary key for the new meetups registration
	* @return the new meetups registration
	*/
	public com.liferay.socialnetworking.model.MeetupsRegistration createMeetupsRegistration(
		long meetupsRegistrationId) {
		return _meetupsRegistrationLocalService.createMeetupsRegistration(meetupsRegistrationId);
	}

	/**
	* Deletes the meetups registration with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param meetupsRegistrationId the primary key of the meetups registration
	* @return the meetups registration that was removed
	* @throws PortalException if a meetups registration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.socialnetworking.model.MeetupsRegistration deleteMeetupsRegistration(
		long meetupsRegistrationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _meetupsRegistrationLocalService.deleteMeetupsRegistration(meetupsRegistrationId);
	}

	/**
	* Deletes the meetups registration from the database. Also notifies the appropriate model listeners.
	*
	* @param meetupsRegistration the meetups registration
	* @return the meetups registration that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.socialnetworking.model.MeetupsRegistration deleteMeetupsRegistration(
		com.liferay.socialnetworking.model.MeetupsRegistration meetupsRegistration)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _meetupsRegistrationLocalService.deleteMeetupsRegistration(meetupsRegistration);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _meetupsRegistrationLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _meetupsRegistrationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _meetupsRegistrationLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _meetupsRegistrationLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _meetupsRegistrationLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.liferay.socialnetworking.model.MeetupsRegistration fetchMeetupsRegistration(
		long meetupsRegistrationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _meetupsRegistrationLocalService.fetchMeetupsRegistration(meetupsRegistrationId);
	}

	/**
	* Returns the meetups registration with the primary key.
	*
	* @param meetupsRegistrationId the primary key of the meetups registration
	* @return the meetups registration
	* @throws PortalException if a meetups registration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.socialnetworking.model.MeetupsRegistration getMeetupsRegistration(
		long meetupsRegistrationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _meetupsRegistrationLocalService.getMeetupsRegistration(meetupsRegistrationId);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _meetupsRegistrationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the meetups registrations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of meetups registrations
	* @param end the upper bound of the range of meetups registrations (not inclusive)
	* @return the range of meetups registrations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.socialnetworking.model.MeetupsRegistration> getMeetupsRegistrations(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _meetupsRegistrationLocalService.getMeetupsRegistrations(start,
			end);
	}

	/**
	* Returns the number of meetups registrations.
	*
	* @return the number of meetups registrations
	* @throws SystemException if a system exception occurred
	*/
	public int getMeetupsRegistrationsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _meetupsRegistrationLocalService.getMeetupsRegistrationsCount();
	}

	/**
	* Updates the meetups registration in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param meetupsRegistration the meetups registration
	* @return the meetups registration that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.socialnetworking.model.MeetupsRegistration updateMeetupsRegistration(
		com.liferay.socialnetworking.model.MeetupsRegistration meetupsRegistration)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _meetupsRegistrationLocalService.updateMeetupsRegistration(meetupsRegistration);
	}

	/**
	* Updates the meetups registration in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param meetupsRegistration the meetups registration
	* @param merge whether to merge the meetups registration with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the meetups registration that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.socialnetworking.model.MeetupsRegistration updateMeetupsRegistration(
		com.liferay.socialnetworking.model.MeetupsRegistration meetupsRegistration,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _meetupsRegistrationLocalService.updateMeetupsRegistration(meetupsRegistration,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _meetupsRegistrationLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_meetupsRegistrationLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _meetupsRegistrationLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	public com.liferay.socialnetworking.model.MeetupsRegistration getMeetupsRegistration(
		long userId, long meetupsEntryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _meetupsRegistrationLocalService.getMeetupsRegistration(userId,
			meetupsEntryId);
	}

	public java.util.List<com.liferay.socialnetworking.model.MeetupsRegistration> getMeetupsRegistrations(
		long meetupsEntryId, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _meetupsRegistrationLocalService.getMeetupsRegistrations(meetupsEntryId,
			status, start, end);
	}

	public int getMeetupsRegistrationsCount(long meetupsEntryId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _meetupsRegistrationLocalService.getMeetupsRegistrationsCount(meetupsEntryId,
			status);
	}

	public com.liferay.socialnetworking.model.MeetupsRegistration updateMeetupsRegistration(
		long userId, long meetupsEntryId, int status, java.lang.String comments)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _meetupsRegistrationLocalService.updateMeetupsRegistration(userId,
			meetupsEntryId, status, comments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public MeetupsRegistrationLocalService getWrappedMeetupsRegistrationLocalService() {
		return _meetupsRegistrationLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedMeetupsRegistrationLocalService(
		MeetupsRegistrationLocalService meetupsRegistrationLocalService) {
		_meetupsRegistrationLocalService = meetupsRegistrationLocalService;
	}

	public MeetupsRegistrationLocalService getWrappedService() {
		return _meetupsRegistrationLocalService;
	}

	public void setWrappedService(
		MeetupsRegistrationLocalService meetupsRegistrationLocalService) {
		_meetupsRegistrationLocalService = meetupsRegistrationLocalService;
	}

	private MeetupsRegistrationLocalService _meetupsRegistrationLocalService;
}