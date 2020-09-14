// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SecureScore;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Secure Score Request.
 */
public class SecureScoreRequest extends BaseRequest implements ISecureScoreRequest {
	
    /**
     * The request for the SecureScore
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SecureScoreRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SecureScore.class);
    }

    /**
     * Gets the SecureScore from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<SecureScore> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the SecureScore from the service
     *
     * @return the SecureScore from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SecureScore get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<SecureScore> callback) {
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
     * Patches this SecureScore with a source
     *
     * @param sourceSecureScore the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final SecureScore sourceSecureScore, final ICallback<SecureScore> callback) {
        send(HttpMethod.PATCH, callback, sourceSecureScore);
    }

    /**
     * Patches this SecureScore with a source
     *
     * @param sourceSecureScore the source object with updates
     * @return the updated SecureScore
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SecureScore patch(final SecureScore sourceSecureScore) throws ClientException {
        return send(HttpMethod.PATCH, sourceSecureScore);
    }

    /**
     * Creates a SecureScore with a new object
     *
     * @param newSecureScore the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final SecureScore newSecureScore, final ICallback<SecureScore> callback) {
        send(HttpMethod.POST, callback, newSecureScore);
    }

    /**
     * Creates a SecureScore with a new object
     *
     * @param newSecureScore the new object to create
     * @return the created SecureScore
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SecureScore post(final SecureScore newSecureScore) throws ClientException {
        return send(HttpMethod.POST, newSecureScore);
    }

    /**
     * Creates a SecureScore with a new object
     *
     * @param newSecureScore the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final SecureScore newSecureScore, final ICallback<SecureScore> callback) {
        send(HttpMethod.PUT, callback, newSecureScore);
    }

    /**
     * Creates a SecureScore with a new object
     *
     * @param newSecureScore the object to create/update
     * @return the created SecureScore
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SecureScore put(final SecureScore newSecureScore) throws ClientException {
        return send(HttpMethod.PUT, newSecureScore);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ISecureScoreRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (SecureScoreRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ISecureScoreRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (SecureScoreRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public ISecureScoreRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (SecureScoreRequest)this;
     }

}

