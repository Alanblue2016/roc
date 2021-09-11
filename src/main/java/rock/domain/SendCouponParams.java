package rock.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Size;

/**
 * @author alan
 */
@ApiModel
@Data
public class SendCouponParams {

//    批次号	stock_id	string(20)	是	微信支付券批次id 示例值：abc123
//    发券凭证	out_request_no	string(128)	是	发券凭证，可包含英文字母，数字，｜，_，*，-等内容，不允许出现其他不合法符号，需在单个批次单个用户下确保唯一性  示例值：1234567
//    券code	coupon_code	string[1,128]	否	券code，如果批次是发放时指定code的类型，则发券时必填coupon_code 示例值：asdsada

    @Size(max = 20)
    @ApiModelProperty(value = "批次号")
    private String stock_id;

    @Size(max = 128)
    @ApiModelProperty(value = "发券凭证")
    private String out_request_no;

    @ApiModelProperty(value = "券code 商家券")
    private String coupon_code;

    @ApiModelProperty(value = "制券商户号,支付券填写")
    private String create_coupon_merchant;

    @ApiModelProperty(value = "自定义领取时间 商家券")
    private String customize_send_time;

    public String getStock_id() {
        return stock_id;
    }

    public void setStock_id(String stock_id) {
        this.stock_id = stock_id;
    }

    public String getOut_request_no() {
        return out_request_no;
    }

    public void setOut_request_no(String out_request_no) {
        this.out_request_no = out_request_no;
    }

    public String getCoupon_code() {
        return coupon_code;
    }

    public void setCoupon_code(String coupon_code) {
        this.coupon_code = coupon_code;
    }

    public String getCreate_coupon_merchant() {
        return create_coupon_merchant;
    }

    public void setCreate_coupon_merchant(String create_coupon_merchant) {
        this.create_coupon_merchant = create_coupon_merchant;
    }

    public String getCustomize_send_time() {
        return customize_send_time;
    }

    public void setCustomize_send_time(String customize_send_time) {
        this.customize_send_time = customize_send_time;
    }
}
