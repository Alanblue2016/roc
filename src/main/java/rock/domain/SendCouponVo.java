package rock.domain;

 import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@ApiModel(value = "发券实体-提供给小程序发券插件")
@Data
public class SendCouponVo {

//    自定义事件	bindcustomevent	string	否	领券后调用的事件，bindcustomevent说明参考《自定义组件文档》
//        -发券参数	send_coupon_params	array	是	发券参数，一次最多10张 示例值：
//    发一张券JSON：   "send_coupon_params":[  { "stock_id": "98065001",    "out_request_no": "89560002019101000121", } ]
//    发多张券JSON：    "send_coupon_params":[    { "stock_id": "98065001",     "out_request_no": "89560002019101000121" }  { "stock_id": "98065001",  "out_request_no": "89560002019101000122" } ]   参数名	变量	类型	必填	描述
//    批次号	stock_id	string(20)	是	微信支付券批次id   示例值：abc123
//    发券凭证	out_request_no	string(128)	是	发券凭证，可包含英文字母，数字，｜，_，*，-等内容，不允许出现其他不合法符号，需在单个批次单个用户下确保唯一性 示例值：1234567
//    签名	sign	string  是	签名计算值   签名方式：HMAC-SHA256。 签名规则：详见《V2签名规则》  参与签名字段说明   注意：为了安全，签名必须在后台服务器计算，禁止在小程序中计算，签名key为微信支付apiv2的signkey  示例值：9A0A8659F005D6984697E2CA0A9CF3B79A0A8659F005D6984697E2CA0A9CF3B7
//    发券商户号	send_coupon_merchant	string(15)	是	发券商户号  特殊规则：长度最小8个字节  示例值：10016226


    @ApiModelProperty(value = "自定义事件，领券后调用的事件")
    private String bindsendcoupon;
    @ApiModelProperty(value = "用户确认领券事件")
    private String binduserconfirm;

    @ApiModelProperty(value = "提示立即使用")
    private Boolean suggest_immediate_use;

    @ApiModelProperty(value = "发券参数")
    private List<SendCouponParams> send_coupon_params;

    @ApiModelProperty(value = "签名")
    private String sign;

    @ApiModelProperty(value = "发券商户号")
    private String send_coupon_merchant;

    @ApiModelProperty(value = "发券商户id")
    private Long merchantId;


    public String getBindsendcoupon() {
        return bindsendcoupon;
    }

    public void setBindsendcoupon(String bindsendcoupon) {
        this.bindsendcoupon = bindsendcoupon;
    }

    public String getBinduserconfirm() {
        return binduserconfirm;
    }

    public void setBinduserconfirm(String binduserconfirm) {
        this.binduserconfirm = binduserconfirm;
    }

    public Boolean getSuggest_immediate_use() {
        return suggest_immediate_use;
    }

    public void setSuggest_immediate_use(Boolean suggest_immediate_use) {
        this.suggest_immediate_use = suggest_immediate_use;
    }

    public List<SendCouponParams> getSend_coupon_params() {
        return send_coupon_params;
    }

    public void setSend_coupon_params(List<SendCouponParams> send_coupon_params) {
        this.send_coupon_params = send_coupon_params;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getSend_coupon_merchant() {
        return send_coupon_merchant;
    }

    public void setSend_coupon_merchant(String send_coupon_merchant) {
        this.send_coupon_merchant = send_coupon_merchant;
    }

    public Long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }
}
