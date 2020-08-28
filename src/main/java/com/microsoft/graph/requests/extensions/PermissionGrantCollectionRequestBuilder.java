// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DriveRecipient;
import com.microsoft.graph.models.extensions.Permission;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IPermissionGrantCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPermissionGrantCollectionRequest;
import com.microsoft.graph.requests.extensions.PermissionGrantCollectionRequest;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.core.BaseActionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Permission Grant Collection Request Builder.
 */
public class PermissionGrantCollectionRequestBuilder extends BaseActionRequestBuilder implements IPermissionGrantCollectionRequestBuilder {

    /**
     * The request builder for this collection of Permission
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param roles the roles
     * @param recipients the recipients
     */
    public PermissionGrantCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final java.util.List<String> roles, final java.util.List<DriveRecipient> recipients) {
        super(requestUrl, client, requestOptions);
  	 if(roles!=null){
			bodyParams.put("roles", roles);
		}
    	 if(recipients!=null){
			bodyParams.put("recipients", recipients);
		}
      }

    public IPermissionGrantCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IPermissionGrantCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        PermissionGrantCollectionRequest request = new PermissionGrantCollectionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("roles")) {
            request.body.roles = getParameter("roles");
        }
        if (hasParameter("recipients")) {
            request.body.recipients = getParameter("recipients");
        }
  
        return request;
    }
}
