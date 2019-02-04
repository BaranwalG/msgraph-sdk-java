// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IReportRootGetTeamsUserActivityUserDetailRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Report Root Get Teams User Activity User Detail Request Builder.
 */
public interface IReportRootGetTeamsUserActivityUserDetailRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IReportRootGetTeamsUserActivityUserDetailRequest
     *
     * @return the IReportRootGetTeamsUserActivityUserDetailRequest instance
     */
    IReportRootGetTeamsUserActivityUserDetailRequest buildRequest();

    /**
     * Creates the IReportRootGetTeamsUserActivityUserDetailRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetTeamsUserActivityUserDetailRequest instance
     */
    IReportRootGetTeamsUserActivityUserDetailRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
