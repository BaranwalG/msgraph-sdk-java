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
import com.microsoft.graph.requests.extensions.DeviceConfigurationStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyStateRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCategoryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device With Reference Request Builder.
 */
public class ManagedDeviceWithReferenceRequestBuilder extends BaseRequestBuilder implements IManagedDeviceWithReferenceRequestBuilder {

    /**
     * The request builder for the ManagedDevice
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceWithReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IManagedDeviceWithReferenceRequest instance
     */
    public IManagedDeviceWithReferenceRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific options instead of the existing options
	 *
     * @param requestOptions the options for this request
     * @return the IManagedDeviceWithReferenceRequest instance
     */
    public IManagedDeviceWithReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new ManagedDeviceWithReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IManagedDeviceReferenceRequestBuilder reference(){
        return new ManagedDeviceReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }

}
