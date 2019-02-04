// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ISharedPCConfigurationRequest;
import com.microsoft.graph.requests.extensions.SharedPCConfigurationRequest;
import com.microsoft.graph.models.extensions.SharedPCConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Shared PCConfiguration Request.
 */
public class SharedPCConfigurationRequest extends BaseRequest implements ISharedPCConfigurationRequest {
	
    /**
     * The request for the SharedPCConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SharedPCConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, SharedPCConfiguration.class);
    }

    /**
     * Gets the SharedPCConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<SharedPCConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the SharedPCConfiguration from the service
     *
     * @return the SharedPCConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SharedPCConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<SharedPCConfiguration> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this SharedPCConfiguration with a source
     *
     * @param sourceSharedPCConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final SharedPCConfiguration sourceSharedPCConfiguration, final ICallback<SharedPCConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceSharedPCConfiguration);
    }

    /**
     * Patches this SharedPCConfiguration with a source
     *
     * @param sourceSharedPCConfiguration the source object with updates
     * @return the updated SharedPCConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SharedPCConfiguration patch(final SharedPCConfiguration sourceSharedPCConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceSharedPCConfiguration);
    }

    /**
     * Creates a SharedPCConfiguration with a new object
     *
     * @param newSharedPCConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final SharedPCConfiguration newSharedPCConfiguration, final ICallback<SharedPCConfiguration> callback) {
        send(HttpMethod.POST, callback, newSharedPCConfiguration);
    }

    /**
     * Creates a SharedPCConfiguration with a new object
     *
     * @param newSharedPCConfiguration the new object to create
     * @return the created SharedPCConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SharedPCConfiguration post(final SharedPCConfiguration newSharedPCConfiguration) throws ClientException {
        return send(HttpMethod.POST, newSharedPCConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ISharedPCConfigurationRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (SharedPCConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ISharedPCConfigurationRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (SharedPCConfigurationRequest)this;
     }

}

