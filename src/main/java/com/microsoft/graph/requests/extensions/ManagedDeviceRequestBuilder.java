// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IManagedDeviceRequest;
import com.microsoft.graph.requests.extensions.ManagedDeviceRequest;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationStateRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyStateRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceRetireRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceRetireRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceWipeRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceWipeRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceResetPasscodeRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceResetPasscodeRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceRemoteLockRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceRemoteLockRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceRequestRemoteAssistanceRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceRequestRemoteAssistanceRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceDisableLostModeRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceDisableLostModeRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceLocateDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceLocateDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceBypassActivationLockRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceBypassActivationLockRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceRebootNowRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceRebootNowRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceShutDownRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceShutDownRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceRecoverPasscodeRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceRecoverPasscodeRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceCleanWindowsDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceCleanWindowsDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceLogoutSharedAppleDeviceActiveUserRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceLogoutSharedAppleDeviceActiveUserRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceDeleteUserFromSharedAppleDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceDeleteUserFromSharedAppleDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceSyncDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceSyncDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceWindowsDefenderScanRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceWindowsDefenderScanRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceWindowsDefenderUpdateSignaturesRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceWindowsDefenderUpdateSignaturesRequestBuilder;
import com.microsoft.graph.models.extensions.UpdateWindowsDeviceAccountActionParameter;
import com.microsoft.graph.requests.extensions.IManagedDeviceUpdateWindowsDeviceAccountRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceUpdateWindowsDeviceAccountRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Request Builder.
 */
public class ManagedDeviceRequestBuilder extends BaseRequestBuilder implements IManagedDeviceRequestBuilder {

    /**
     * The request builder for the ManagedDevice
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IManagedDeviceRequest instance
     */
    public IManagedDeviceRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IManagedDeviceRequest instance
     */
    public IManagedDeviceRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new ManagedDeviceRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IDeviceConfigurationStateCollectionRequestBuilder deviceConfigurationStates() {
        return new DeviceConfigurationStateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceConfigurationStates"), getClient(), null);
    }

    public IDeviceConfigurationStateRequestBuilder deviceConfigurationStates(final String id) {
        return new DeviceConfigurationStateRequestBuilder(getRequestUrlWithAdditionalSegment("deviceConfigurationStates") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for DeviceCategory
     *
     * @return the IDeviceCategoryRequestBuilder instance
     */
    public IDeviceCategoryRequestBuilder deviceCategory() {
        return new DeviceCategoryRequestBuilder(getRequestUrlWithAdditionalSegment("deviceCategory"), getClient(), null);
    }
    public IDeviceCompliancePolicyStateCollectionRequestBuilder deviceCompliancePolicyStates() {
        return new DeviceCompliancePolicyStateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceCompliancePolicyStates"), getClient(), null);
    }

    public IDeviceCompliancePolicyStateRequestBuilder deviceCompliancePolicyStates(final String id) {
        return new DeviceCompliancePolicyStateRequestBuilder(getRequestUrlWithAdditionalSegment("deviceCompliancePolicyStates") + "/" + id, getClient(), null);
    }

    public IManagedDeviceRetireRequestBuilder retire() {
        return new ManagedDeviceRetireRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.retire"), getClient(), null);
    }

    public IManagedDeviceWipeRequestBuilder wipe(final Boolean keepEnrollmentData, final Boolean keepUserData, final String macOsUnlockCode) {
        return new ManagedDeviceWipeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.wipe"), getClient(), null, keepEnrollmentData, keepUserData, macOsUnlockCode);
    }

    public IManagedDeviceResetPasscodeRequestBuilder resetPasscode() {
        return new ManagedDeviceResetPasscodeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.resetPasscode"), getClient(), null);
    }

    public IManagedDeviceRemoteLockRequestBuilder remoteLock() {
        return new ManagedDeviceRemoteLockRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.remoteLock"), getClient(), null);
    }

    public IManagedDeviceRequestRemoteAssistanceRequestBuilder requestRemoteAssistance() {
        return new ManagedDeviceRequestRemoteAssistanceRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.requestRemoteAssistance"), getClient(), null);
    }

    public IManagedDeviceDisableLostModeRequestBuilder disableLostMode() {
        return new ManagedDeviceDisableLostModeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.disableLostMode"), getClient(), null);
    }

    public IManagedDeviceLocateDeviceRequestBuilder locateDevice() {
        return new ManagedDeviceLocateDeviceRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.locateDevice"), getClient(), null);
    }

    public IManagedDeviceBypassActivationLockRequestBuilder bypassActivationLock() {
        return new ManagedDeviceBypassActivationLockRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.bypassActivationLock"), getClient(), null);
    }

    public IManagedDeviceRebootNowRequestBuilder rebootNow() {
        return new ManagedDeviceRebootNowRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.rebootNow"), getClient(), null);
    }

    public IManagedDeviceShutDownRequestBuilder shutDown() {
        return new ManagedDeviceShutDownRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.shutDown"), getClient(), null);
    }

    public IManagedDeviceRecoverPasscodeRequestBuilder recoverPasscode() {
        return new ManagedDeviceRecoverPasscodeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.recoverPasscode"), getClient(), null);
    }

    public IManagedDeviceCleanWindowsDeviceRequestBuilder cleanWindowsDevice(final Boolean keepUserData) {
        return new ManagedDeviceCleanWindowsDeviceRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.cleanWindowsDevice"), getClient(), null, keepUserData);
    }

    public IManagedDeviceLogoutSharedAppleDeviceActiveUserRequestBuilder logoutSharedAppleDeviceActiveUser() {
        return new ManagedDeviceLogoutSharedAppleDeviceActiveUserRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.logoutSharedAppleDeviceActiveUser"), getClient(), null);
    }

    public IManagedDeviceDeleteUserFromSharedAppleDeviceRequestBuilder deleteUserFromSharedAppleDevice(final String userPrincipalName) {
        return new ManagedDeviceDeleteUserFromSharedAppleDeviceRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.deleteUserFromSharedAppleDevice"), getClient(), null, userPrincipalName);
    }

    public IManagedDeviceSyncDeviceRequestBuilder syncDevice() {
        return new ManagedDeviceSyncDeviceRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.syncDevice"), getClient(), null);
    }

    public IManagedDeviceWindowsDefenderScanRequestBuilder windowsDefenderScan(final Boolean quickScan) {
        return new ManagedDeviceWindowsDefenderScanRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.windowsDefenderScan"), getClient(), null, quickScan);
    }

    public IManagedDeviceWindowsDefenderUpdateSignaturesRequestBuilder windowsDefenderUpdateSignatures() {
        return new ManagedDeviceWindowsDefenderUpdateSignaturesRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.windowsDefenderUpdateSignatures"), getClient(), null);
    }

    public IManagedDeviceUpdateWindowsDeviceAccountRequestBuilder updateWindowsDeviceAccount(final UpdateWindowsDeviceAccountActionParameter updateWindowsDeviceAccountActionParameter) {
        return new ManagedDeviceUpdateWindowsDeviceAccountRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.updateWindowsDeviceAccount"), getClient(), null, updateWindowsDeviceAccountActionParameter);
    }
}

