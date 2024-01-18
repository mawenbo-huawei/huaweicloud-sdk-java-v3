package com.huaweicloud.sdk.cdn.v2.region;

import com.huaweicloud.sdk.core.region.IRegionProvider;
import com.huaweicloud.sdk.core.region.Region;
import com.huaweicloud.sdk.core.region.RegionProviderChain;
import com.huaweicloud.sdk.core.utils.StringUtils;

import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class CdnRegion {

    public static final Region CN_NORTH_1 = new Region("cn-north-1", "https://cdn.myhuaweicloud.com");

    public static final Region AP_SOUTHEAST_1 = new Region("ap-southeast-1", "https://cdn.myhuaweicloud.com");

    public static final Region EU_WEST_101 = new Region("eu-west-101", "https://cdn.myhuaweicloud.eu");

    private static final IRegionProvider PROVIDER = RegionProviderChain.getDefaultRegionProviderChain("CDN");

    private static final Map<String, Region> STATIC_FIELDS = createStaticFields();

    private static Map<String, Region> createStaticFields() {
        Map<String, Region> map = new HashMap<>();
        map.put("cn-north-1", CN_NORTH_1);
        map.put("ap-southeast-1", AP_SOUTHEAST_1);
        map.put("eu-west-101", EU_WEST_101);
        return Collections.unmodifiableMap(map);
    }

    public static Region valueOf(String regionId) {
        if (StringUtils.isEmpty(regionId)) {
            throw new IllegalArgumentException("Unexpected empty parameter: regionId.");
        }

        Region result = PROVIDER.getRegion(regionId);
        if (Objects.nonNull(result)) {
            return result;
        }

        result = STATIC_FIELDS.get(regionId);
        if (Objects.nonNull(result)) {
            return result;
        }

        throw new IllegalArgumentException(String.format(Locale.ROOT,
            "region id '%s' is not in the following supported regions of service CDN: [%s]",
            regionId,
            STATIC_FIELDS.keySet().stream().sorted().collect(Collectors.joining(", "))));
    }
}
