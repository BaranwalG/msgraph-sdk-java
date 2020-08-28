// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedDevice;
import com.microsoft.graph.models.extensions.UpdateWindowsDeviceAccountActionParameter;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCategoryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Managed Device Request Builder.
 */
public interface IManagedDeviceRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IManagedDeviceRequest instance
     */
    IManagedDeviceRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IManagedDeviceRequest instance
     */
    IManagedDeviceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IDeviceConfigurationStateCollectionRequestBuilder deviceConfigurationStates();

    IDeviceConfigurationStateRequestBuilder deviceConfigurationStates(final String id);

    IDeviceCompliancePolicyStateCollectionRequestBuilder deviceCompliancePolicyStates();

    IDeviceCompliancePolicyStateRequestBuilder deviceCompliancePolicyStates(final String id);

    /**
     * Gets the request builder for DeviceCategory
     *
     * @return the IDeviceCategoryRequestBuilder instance
     */
    IDeviceCategoryRequestBuilder deviceCategory();
    IManagedDeviceRetireRequestBuilder retire();
    IManagedDeviceWipeRequestBuilder wipe(final Boolean keepEnrollmentData, final Boolean keepUserData, final String macOsUnlockCode);
    IManagedDeviceResetPasscodeRequestBuilder resetPasscode();
    IManagedDeviceRemoteLockRequestBuilder remoteLock();
    IManagedDeviceRequestRemoteAssistanceRequestBuilder requestRemoteAssistance();
    IManagedDeviceDisableLostModeRequestBuilder disableLostMode();
    IManagedDeviceLocateDeviceRequestBuilder locateDevice();
    IManagedDeviceBypassActivationLockRequestBuilder bypassActivationLock();
    IManagedDeviceRebootNowRequestBuilder rebootNow();
    IManagedDeviceShutDownRequestBuilder shutDown();
    IManagedDeviceRecoverPasscodeRequestBuilder recoverPasscode();
    IManagedDeviceCleanWindowsDeviceRequestBuilder cleanWindowsDevice(final Boolean keepUserData);
    IManagedDeviceLogoutSharedAppleDeviceActiveUserRequestBuilder logoutSharedAppleDeviceActiveUser();
    IManagedDeviceDeleteUserFromSharedAppleDeviceRequestBuilder deleteUserFromSharedAppleDevice(final String userPrincipalName);
    IManagedDeviceSyncDeviceRequestBuilder syncDevice();
    IManagedDeviceWindowsDefenderScanRequestBuilder windowsDefenderScan(final Boolean quickScan);
    IManagedDeviceWindowsDefenderUpdateSignaturesRequestBuilder windowsDefenderUpdateSignatures();
    IManagedDeviceUpdateWindowsDeviceAccountRequestBuilder updateWindowsDeviceAccount(final UpdateWindowsDeviceAccountActionParameter updateWindowsDeviceAccountActionParameter);

}