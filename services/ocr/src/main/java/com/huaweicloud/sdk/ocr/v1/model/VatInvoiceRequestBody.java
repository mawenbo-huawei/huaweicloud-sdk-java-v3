package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class VatInvoiceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private String image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "advanced_mode")

    private Boolean advancedMode;

    public VatInvoiceRequestBody withImage(String image) {
        this.image = image;
        return this;
    }

    /** 与url二选一 图像数据，base64编码，要求base64编码后大小不超过10MB。图片最小边不小于100px，最长边不超过8192px，支持JPEG、JPG、PNG、BMP、TIFF格式。
     * 图片文件Base64编码字符串，点击[这里](https://support.huaweicloud.com/ocr_faq/ocr_01_0032.html)查看详细获取方式。
     * 
     * @return image */
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public VatInvoiceRequestBody withUrl(String url) {
        this.url = url;
        return this;
    }

    /** 与image二选一 图片的URL路径，目前支持： - 公网http/https url -
     * OBS提供的url，使用OBS数据需要进行授权。包括对服务授权、临时授权、匿名公开授权，详情参见[配置OBS访问权限](https://support.huaweicloud.com/api-ocr/ocr_03_0132.html)。
     * > 说明： - 接口响应时间依赖于图片的下载时间，如果图片下载时间过长，会返回接口调用失败。 - 请保证被检测图片所在的存储服务稳定可靠，推荐使用OBS服务存储图片数据。
     * 
     * @return url */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public VatInvoiceRequestBody withAdvancedMode(Boolean advancedMode) {
        this.advancedMode = advancedMode;
        return this;
    }

    /** 默认为false，如果传参为true，则返回更多字段
     * 
     * @return advancedMode */
    public Boolean getAdvancedMode() {
        return advancedMode;
    }

    public void setAdvancedMode(Boolean advancedMode) {
        this.advancedMode = advancedMode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VatInvoiceRequestBody vatInvoiceRequestBody = (VatInvoiceRequestBody) o;
        return Objects.equals(this.image, vatInvoiceRequestBody.image)
            && Objects.equals(this.url, vatInvoiceRequestBody.url)
            && Objects.equals(this.advancedMode, vatInvoiceRequestBody.advancedMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(image, url, advancedMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VatInvoiceRequestBody {\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    advancedMode: ").append(toIndentedString(advancedMode)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}