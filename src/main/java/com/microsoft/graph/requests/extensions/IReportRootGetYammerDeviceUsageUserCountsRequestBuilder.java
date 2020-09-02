// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IReportRootGetYammerDeviceUsageUserCountsRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Report Root Get Yammer Device Usage User Counts Request Builder.
 */
public interface IReportRootGetYammerDeviceUsageUserCountsRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IReportRootGetYammerDeviceUsageUserCountsRequest
     *
     * @return the IReportRootGetYammerDeviceUsageUserCountsRequest instance
     */
    IReportRootGetYammerDeviceUsageUserCountsRequest buildRequest();

    /**
     * Creates the IReportRootGetYammerDeviceUsageUserCountsRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetYammerDeviceUsageUserCountsRequest instance
     */
    IReportRootGetYammerDeviceUsageUserCountsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
