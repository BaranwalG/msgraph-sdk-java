// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsNorm_S_InvRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsNorm_S_InvRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Norm_S_Inv Request Builder.
 */
public class WorkbookFunctionsNorm_S_InvRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsNorm_S_InvRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsNorm_S_Inv
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param probability the probability
     */
    public WorkbookFunctionsNorm_S_InvRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement probability) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("probability", probability);
    }

    /**
     * Creates the IWorkbookFunctionsNorm_S_InvRequest
     *
     * @return the IWorkbookFunctionsNorm_S_InvRequest instance
     */
    public IWorkbookFunctionsNorm_S_InvRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsNorm_S_InvRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsNorm_S_InvRequest instance
     */
    public IWorkbookFunctionsNorm_S_InvRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsNorm_S_InvRequest request = new WorkbookFunctionsNorm_S_InvRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("probability")) {
            request.body.probability = getParameter("probability");
        }

        return request;
    }
}
