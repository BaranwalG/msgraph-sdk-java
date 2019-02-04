// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsBin2OctRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Bin2Oct Request Builder.
 */
public interface IWorkbookFunctionsBin2OctRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsBin2OctRequest
     *
     * @return the IWorkbookFunctionsBin2OctRequest instance
     */
    IWorkbookFunctionsBin2OctRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsBin2OctRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsBin2OctRequest instance
     */
    IWorkbookFunctionsBin2OctRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
