// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsMonthRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsMonthRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.FunctionOption;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Month Request Builder.
 */
public class WorkbookFunctionsMonthRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsMonthRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsMonth
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param serialNumber the serialNumber
     */
    public WorkbookFunctionsMonthRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement serialNumber) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("serialNumber", serialNumber);
    }

    /**
     * Creates the IWorkbookFunctionsMonthRequest
     *
     * @return the IWorkbookFunctionsMonthRequest instance
     */
    public IWorkbookFunctionsMonthRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsMonthRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsMonthRequest instance
     */
    public IWorkbookFunctionsMonthRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsMonthRequest request = new WorkbookFunctionsMonthRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("serialNumber")) {
            request.body.serialNumber = getParameter("serialNumber");
        }

        return request;
    }
}
