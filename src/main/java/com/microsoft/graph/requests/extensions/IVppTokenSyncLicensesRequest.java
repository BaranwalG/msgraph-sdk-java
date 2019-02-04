// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.VppToken;
import com.microsoft.graph.requests.extensions.IVppTokenSyncLicensesRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Vpp Token Sync Licenses Request.
 */
public interface IVppTokenSyncLicensesRequest {

    /**
     * Creates the VppTokenSyncLicenses
     *
     * @param callback the callback to be called after success or failure
     */
    void post(final ICallback<VppToken> callback);

    /**
     * Creates the VppTokenSyncLicenses
     *
     * @return the VppToken
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    VppToken post() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IVppTokenSyncLicensesRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IVppTokenSyncLicensesRequest expand(final String value);

}