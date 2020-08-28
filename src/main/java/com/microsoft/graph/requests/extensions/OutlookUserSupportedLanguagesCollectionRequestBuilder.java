// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.LocaleInfo;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IOutlookUserSupportedLanguagesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOutlookUserSupportedLanguagesCollectionRequest;
import com.microsoft.graph.requests.extensions.OutlookUserSupportedLanguagesCollectionRequest;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Outlook User Supported Languages Collection Request Builder.
 */
public class OutlookUserSupportedLanguagesCollectionRequestBuilder extends BaseFunctionRequestBuilder implements IOutlookUserSupportedLanguagesCollectionRequestBuilder {

    /**
     * The request builder for this collection of OutlookUser
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OutlookUserSupportedLanguagesCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IOutlookUserSupportedLanguagesCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IOutlookUserSupportedLanguagesCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        OutlookUserSupportedLanguagesCollectionRequest request = new OutlookUserSupportedLanguagesCollectionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}
