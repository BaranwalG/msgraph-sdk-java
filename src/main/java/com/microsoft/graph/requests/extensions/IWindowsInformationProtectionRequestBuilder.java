// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionRequest;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionAppLockerFileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionAppLockerFileRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionAppLockerFileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionAppLockerFileRequestBuilder;
import com.microsoft.graph.requests.extensions.ITargetedManagedAppPolicyAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITargetedManagedAppPolicyAssignmentRequestBuilder;
import com.microsoft.graph.models.extensions.TargetedManagedAppPolicyAssignment;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionAssignRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows Information Protection Request Builder.
 */
public interface IWindowsInformationProtectionRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IWindowsInformationProtectionRequest instance
     */
    IWindowsInformationProtectionRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IWindowsInformationProtectionRequest instance
     */
    IWindowsInformationProtectionRequest buildRequest(final java.util.List<? extends Option> requestOptions);


    IWindowsInformationProtectionAppLockerFileCollectionRequestBuilder protectedAppLockerFiles();

    IWindowsInformationProtectionAppLockerFileRequestBuilder protectedAppLockerFiles(final String id);

    IWindowsInformationProtectionAppLockerFileCollectionRequestBuilder exemptAppLockerFiles();

    IWindowsInformationProtectionAppLockerFileRequestBuilder exemptAppLockerFiles(final String id);

    ITargetedManagedAppPolicyAssignmentCollectionRequestBuilder assignments();

    ITargetedManagedAppPolicyAssignmentRequestBuilder assignments(final String id);
    IWindowsInformationProtectionAssignRequestBuilder assign(final java.util.List<TargetedManagedAppPolicyAssignment> assignments);

}