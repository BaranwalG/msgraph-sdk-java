// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.CancelMediaProcessingOperation;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Cancel Media Processing Operation Request.
 */
public class CancelMediaProcessingOperationRequest extends BaseRequest implements ICancelMediaProcessingOperationRequest {
	
    /**
     * The request for the CancelMediaProcessingOperation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CancelMediaProcessingOperationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CancelMediaProcessingOperation.class);
    }

    /**
     * Gets the CancelMediaProcessingOperation from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<CancelMediaProcessingOperation> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the CancelMediaProcessingOperation from the service
     *
     * @return the CancelMediaProcessingOperation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public CancelMediaProcessingOperation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<CancelMediaProcessingOperation> callback) {
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
     * Patches this CancelMediaProcessingOperation with a source
     *
     * @param sourceCancelMediaProcessingOperation the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final CancelMediaProcessingOperation sourceCancelMediaProcessingOperation, final ICallback<CancelMediaProcessingOperation> callback) {
        send(HttpMethod.PATCH, callback, sourceCancelMediaProcessingOperation);
    }

    /**
     * Patches this CancelMediaProcessingOperation with a source
     *
     * @param sourceCancelMediaProcessingOperation the source object with updates
     * @return the updated CancelMediaProcessingOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public CancelMediaProcessingOperation patch(final CancelMediaProcessingOperation sourceCancelMediaProcessingOperation) throws ClientException {
        return send(HttpMethod.PATCH, sourceCancelMediaProcessingOperation);
    }

    /**
     * Creates a CancelMediaProcessingOperation with a new object
     *
     * @param newCancelMediaProcessingOperation the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final CancelMediaProcessingOperation newCancelMediaProcessingOperation, final ICallback<CancelMediaProcessingOperation> callback) {
        send(HttpMethod.POST, callback, newCancelMediaProcessingOperation);
    }

    /**
     * Creates a CancelMediaProcessingOperation with a new object
     *
     * @param newCancelMediaProcessingOperation the new object to create
     * @return the created CancelMediaProcessingOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public CancelMediaProcessingOperation post(final CancelMediaProcessingOperation newCancelMediaProcessingOperation) throws ClientException {
        return send(HttpMethod.POST, newCancelMediaProcessingOperation);
    }

    /**
     * Creates a CancelMediaProcessingOperation with a new object
     *
     * @param newCancelMediaProcessingOperation the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final CancelMediaProcessingOperation newCancelMediaProcessingOperation, final ICallback<CancelMediaProcessingOperation> callback) {
        send(HttpMethod.PUT, callback, newCancelMediaProcessingOperation);
    }

    /**
     * Creates a CancelMediaProcessingOperation with a new object
     *
     * @param newCancelMediaProcessingOperation the object to create/update
     * @return the created CancelMediaProcessingOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public CancelMediaProcessingOperation put(final CancelMediaProcessingOperation newCancelMediaProcessingOperation) throws ClientException {
        return send(HttpMethod.PUT, newCancelMediaProcessingOperation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ICancelMediaProcessingOperationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (CancelMediaProcessingOperationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ICancelMediaProcessingOperationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (CancelMediaProcessingOperationRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public ICancelMediaProcessingOperationRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (CancelMediaProcessingOperationRequest)this;
     }

}

