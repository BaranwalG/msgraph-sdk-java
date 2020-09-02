// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsBesselYRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsBesselYRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Bessel YRequest Builder.
 */
public class WorkbookFunctionsBesselYRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsBesselYRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsBesselY
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param x the x
     * @param n the n
     */
    public WorkbookFunctionsBesselYRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement x, final com.google.gson.JsonElement n) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("x", x);
        bodyParams.put("n", n);
    }

    /**
     * Creates the IWorkbookFunctionsBesselYRequest
     *
     * @return the IWorkbookFunctionsBesselYRequest instance
     */
    public IWorkbookFunctionsBesselYRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsBesselYRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsBesselYRequest instance
     */
    public IWorkbookFunctionsBesselYRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsBesselYRequest request = new WorkbookFunctionsBesselYRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("x")) {
            request.body.x = getParameter("x");
        }

        if (hasParameter("n")) {
            request.body.n = getParameter("n");
        }

        return request;
    }
}
