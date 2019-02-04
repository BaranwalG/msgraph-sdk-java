// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsEoMonthRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Eo Month Request Builder.
 */
public interface IWorkbookFunctionsEoMonthRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsEoMonthRequest
     *
     * @return the IWorkbookFunctionsEoMonthRequest instance
     */
    IWorkbookFunctionsEoMonthRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsEoMonthRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsEoMonthRequest instance
     */
    IWorkbookFunctionsEoMonthRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
