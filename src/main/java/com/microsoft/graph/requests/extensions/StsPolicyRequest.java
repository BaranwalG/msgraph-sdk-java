// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.StsPolicy;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sts Policy Request.
 */
public class StsPolicyRequest extends BaseRequest implements IStsPolicyRequest {
	
    /**
     * The request for the StsPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public StsPolicyRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends StsPolicy> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the StsPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public StsPolicyRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, StsPolicy.class);
    }

    /**
     * Gets the StsPolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<StsPolicy> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the StsPolicy from the service
     *
     * @return the StsPolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public StsPolicy get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<StsPolicy> callback) {
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
     * Patches this StsPolicy with a source
     *
     * @param sourceStsPolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final StsPolicy sourceStsPolicy, final ICallback<StsPolicy> callback) {
        send(HttpMethod.PATCH, callback, sourceStsPolicy);
    }

    /**
     * Patches this StsPolicy with a source
     *
     * @param sourceStsPolicy the source object with updates
     * @return the updated StsPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public StsPolicy patch(final StsPolicy sourceStsPolicy) throws ClientException {
        return send(HttpMethod.PATCH, sourceStsPolicy);
    }

    /**
     * Creates a StsPolicy with a new object
     *
     * @param newStsPolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final StsPolicy newStsPolicy, final ICallback<StsPolicy> callback) {
        send(HttpMethod.POST, callback, newStsPolicy);
    }

    /**
     * Creates a StsPolicy with a new object
     *
     * @param newStsPolicy the new object to create
     * @return the created StsPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public StsPolicy post(final StsPolicy newStsPolicy) throws ClientException {
        return send(HttpMethod.POST, newStsPolicy);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IStsPolicyRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (StsPolicyRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IStsPolicyRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (StsPolicyRequest)this;
     }

}

