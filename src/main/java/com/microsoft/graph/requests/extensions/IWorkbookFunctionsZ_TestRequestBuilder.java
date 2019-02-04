// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsZ_TestRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Z_Test Request Builder.
 */
public interface IWorkbookFunctionsZ_TestRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsZ_TestRequest
     *
     * @return the IWorkbookFunctionsZ_TestRequest instance
     */
    IWorkbookFunctionsZ_TestRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsZ_TestRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsZ_TestRequest instance
     */
    IWorkbookFunctionsZ_TestRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
