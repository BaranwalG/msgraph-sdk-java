// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsUnicodeRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Unicode Request Builder.
 */
public interface IWorkbookFunctionsUnicodeRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsUnicodeRequest
     *
     * @return the IWorkbookFunctionsUnicodeRequest instance
     */
    IWorkbookFunctionsUnicodeRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsUnicodeRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsUnicodeRequest instance
     */
    IWorkbookFunctionsUnicodeRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
