// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsBitorRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsBitorRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Bitor Request Builder.
 */
public class WorkbookFunctionsBitorRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsBitorRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsBitor
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number1 the number1
     * @param number2 the number2
     */
    public WorkbookFunctionsBitorRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement number1, final com.google.gson.JsonElement number2) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("number1", number1);
        bodyParams.put("number2", number2);
    }

    /**
     * Creates the IWorkbookFunctionsBitorRequest
     *
     * @return the IWorkbookFunctionsBitorRequest instance
     */
    public IWorkbookFunctionsBitorRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsBitorRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsBitorRequest instance
     */
    public IWorkbookFunctionsBitorRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsBitorRequest request = new WorkbookFunctionsBitorRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("number1")) {
            request.body.number1 = getParameter("number1");
        }

        if (hasParameter("number2")) {
            request.body.number2 = getParameter("number2");
        }

        return request;
    }
}
