// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationDeviceOverviewRequest;
import com.microsoft.graph.requests.extensions.DeviceConfigurationDeviceOverviewRequest;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration Device Overview Request Builder.
 */
public class DeviceConfigurationDeviceOverviewRequestBuilder extends BaseRequestBuilder implements IDeviceConfigurationDeviceOverviewRequestBuilder {

    /**
     * The request builder for the DeviceConfigurationDeviceOverview
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceConfigurationDeviceOverviewRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IDeviceConfigurationDeviceOverviewRequest instance
     */
    public IDeviceConfigurationDeviceOverviewRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IDeviceConfigurationDeviceOverviewRequest instance
     */
    public IDeviceConfigurationDeviceOverviewRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new DeviceConfigurationDeviceOverviewRequest(getRequestUrl(), getClient(), requestOptions);
    }


}
