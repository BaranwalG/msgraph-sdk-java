// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.DeviceManagementExchangeConnector;
import com.microsoft.graph.models.generated.DeviceManagementExchangeConnectorSyncType;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Management Exchange Connector Collection Request.
 */
public interface IDeviceManagementExchangeConnectorCollectionRequest {

    void get(final ICallback<IDeviceManagementExchangeConnectorCollectionPage> callback);

    IDeviceManagementExchangeConnectorCollectionPage get() throws ClientException;

    void post(final DeviceManagementExchangeConnector newDeviceManagementExchangeConnector, final ICallback<DeviceManagementExchangeConnector> callback);

    DeviceManagementExchangeConnector post(final DeviceManagementExchangeConnector newDeviceManagementExchangeConnector) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceManagementExchangeConnectorCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceManagementExchangeConnectorCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IDeviceManagementExchangeConnectorCollectionRequest top(final int value);

}
