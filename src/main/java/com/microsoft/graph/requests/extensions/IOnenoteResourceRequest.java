// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.OnenoteResource;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Onenote Resource Request.
 */
public interface IOnenoteResourceRequest extends IHttpRequest {

    /**
     * Gets the OnenoteResource from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<OnenoteResource> callback);

    /**
     * Gets the OnenoteResource from the service
     *
     * @return the OnenoteResource from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OnenoteResource get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<OnenoteResource> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this OnenoteResource with a source
     *
     * @param sourceOnenoteResource the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final OnenoteResource sourceOnenoteResource, final ICallback<OnenoteResource> callback);

    /**
     * Patches this OnenoteResource with a source
     *
     * @param sourceOnenoteResource the source object with updates
     * @return the updated OnenoteResource
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OnenoteResource patch(final OnenoteResource sourceOnenoteResource) throws ClientException;

    /**
     * Posts a OnenoteResource with a new object
     *
     * @param newOnenoteResource the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final OnenoteResource newOnenoteResource, final ICallback<OnenoteResource> callback);

    /**
     * Posts a OnenoteResource with a new object
     *
     * @param newOnenoteResource the new object to create
     * @return the created OnenoteResource
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OnenoteResource post(final OnenoteResource newOnenoteResource) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IOnenoteResourceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IOnenoteResourceRequest expand(final String value);

}

