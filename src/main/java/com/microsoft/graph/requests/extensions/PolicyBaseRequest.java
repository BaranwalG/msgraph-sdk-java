// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PolicyBase;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Policy Base Request.
 */
public class PolicyBaseRequest extends BaseRequest implements IPolicyBaseRequest {
	
    /**
     * The request for the PolicyBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public PolicyBaseRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends PolicyBase> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the PolicyBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PolicyBaseRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PolicyBase.class);
    }

    /**
     * Gets the PolicyBase from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<PolicyBase> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PolicyBase from the service
     *
     * @return the PolicyBase from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PolicyBase get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<PolicyBase> callback) {
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
     * Patches this PolicyBase with a source
     *
     * @param sourcePolicyBase the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final PolicyBase sourcePolicyBase, final ICallback<PolicyBase> callback) {
        send(HttpMethod.PATCH, callback, sourcePolicyBase);
    }

    /**
     * Patches this PolicyBase with a source
     *
     * @param sourcePolicyBase the source object with updates
     * @return the updated PolicyBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PolicyBase patch(final PolicyBase sourcePolicyBase) throws ClientException {
        return send(HttpMethod.PATCH, sourcePolicyBase);
    }

    /**
     * Creates a PolicyBase with a new object
     *
     * @param newPolicyBase the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final PolicyBase newPolicyBase, final ICallback<PolicyBase> callback) {
        send(HttpMethod.POST, callback, newPolicyBase);
    }

    /**
     * Creates a PolicyBase with a new object
     *
     * @param newPolicyBase the new object to create
     * @return the created PolicyBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PolicyBase post(final PolicyBase newPolicyBase) throws ClientException {
        return send(HttpMethod.POST, newPolicyBase);
    }

    /**
     * Creates a PolicyBase with a new object
     *
     * @param newPolicyBase the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final PolicyBase newPolicyBase, final ICallback<PolicyBase> callback) {
        send(HttpMethod.PUT, callback, newPolicyBase);
    }

    /**
     * Creates a PolicyBase with a new object
     *
     * @param newPolicyBase the object to create/update
     * @return the created PolicyBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PolicyBase put(final PolicyBase newPolicyBase) throws ClientException {
        return send(HttpMethod.PUT, newPolicyBase);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IPolicyBaseRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (PolicyBaseRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IPolicyBaseRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (PolicyBaseRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IPolicyBaseRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (PolicyBaseRequest)this;
     }

}

