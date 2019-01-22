package com.qs.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 服务响应DTO
 *
 * @author FBin
 * @time 2019/1/21 10:40
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseDto implements Serializable {

    private String code;

    private String message;

    private Object data;

}
