// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IReportRootGetEmailAppUsageAppsUserCountsRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Report Root Get Email App Usage Apps User Counts Request Builder.
 */
public interface IReportRootGetEmailAppUsageAppsUserCountsRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IReportRootGetEmailAppUsageAppsUserCountsRequest
     *
     * @return the IReportRootGetEmailAppUsageAppsUserCountsRequest instance
     */
    IReportRootGetEmailAppUsageAppsUserCountsRequest buildRequest();

    /**
     * Creates the IReportRootGetEmailAppUsageAppsUserCountsRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetEmailAppUsageAppsUserCountsRequest instance
     */
    IReportRootGetEmailAppUsageAppsUserCountsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
