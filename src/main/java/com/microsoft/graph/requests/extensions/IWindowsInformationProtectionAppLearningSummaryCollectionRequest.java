// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.WindowsInformationProtectionAppLearningSummary;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows Information Protection App Learning Summary Collection Request.
 */
public interface IWindowsInformationProtectionAppLearningSummaryCollectionRequest {

    void get(final ICallback<IWindowsInformationProtectionAppLearningSummaryCollectionPage> callback);

    IWindowsInformationProtectionAppLearningSummaryCollectionPage get() throws ClientException;

    void post(final WindowsInformationProtectionAppLearningSummary newWindowsInformationProtectionAppLearningSummary, final ICallback<WindowsInformationProtectionAppLearningSummary> callback);

    WindowsInformationProtectionAppLearningSummary post(final WindowsInformationProtectionAppLearningSummary newWindowsInformationProtectionAppLearningSummary) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWindowsInformationProtectionAppLearningSummaryCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWindowsInformationProtectionAppLearningSummaryCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IWindowsInformationProtectionAppLearningSummaryCollectionRequest top(final int value);

}
