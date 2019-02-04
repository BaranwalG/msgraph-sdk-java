// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookRefreshSessionRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Refresh Session Request Builder.
 */
public interface IWorkbookRefreshSessionRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookRefreshSessionRequest
     *
     * @return the IWorkbookRefreshSessionRequest instance
     */
    IWorkbookRefreshSessionRequest buildRequest();

    /**
     * Creates the IWorkbookRefreshSessionRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookRefreshSessionRequest instance
     */
    IWorkbookRefreshSessionRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
