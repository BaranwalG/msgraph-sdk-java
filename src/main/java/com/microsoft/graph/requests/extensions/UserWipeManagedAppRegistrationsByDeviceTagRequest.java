// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UserWipeManagedAppRegistrationsByDeviceTagBody;
import com.microsoft.graph.requests.extensions.IUserWipeManagedAppRegistrationsByDeviceTagRequest;
import com.microsoft.graph.requests.extensions.UserWipeManagedAppRegistrationsByDeviceTagRequest;

import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Wipe Managed App Registrations By Device Tag Request.
 */
public class UserWipeManagedAppRegistrationsByDeviceTagRequest extends BaseRequest implements IUserWipeManagedAppRegistrationsByDeviceTagRequest {
    protected final UserWipeManagedAppRegistrationsByDeviceTagBody body;

    /**
     * The request for this UserWipeManagedAppRegistrationsByDeviceTag
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserWipeManagedAppRegistrationsByDeviceTagRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Void.class);
        body = new UserWipeManagedAppRegistrationsByDeviceTagBody();
    }

    public void post(final ICallback<Void> callback) {
        send(HttpMethod.POST, callback, body);
    }

    public Void post() throws ClientException {
        return send(HttpMethod.POST, body);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IUserWipeManagedAppRegistrationsByDeviceTagRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (UserWipeManagedAppRegistrationsByDeviceTagRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IUserWipeManagedAppRegistrationsByDeviceTagRequest top(final int value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (UserWipeManagedAppRegistrationsByDeviceTagRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IUserWipeManagedAppRegistrationsByDeviceTagRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (UserWipeManagedAppRegistrationsByDeviceTagRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IUserWipeManagedAppRegistrationsByDeviceTagRequest filter(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (UserWipeManagedAppRegistrationsByDeviceTagRequest)this;
    }

}
