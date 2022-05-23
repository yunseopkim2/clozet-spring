package kr.co.clozet.security.domains;

import lombok.Builder;
import lombok.Getter;
import org.springframework.stereotype.Component;

/**
 * packageName:
 * fileName        :
 * author           : kimyunseop
 * date               : 2022-05-23
 * ================================
 * DATE          AUTHOR       NOTE
 * ================================
 * 22022-05-23  kimyunseop   최초 생성
 */
@Getter @Builder
public class Messenger {
    private String message, code;
    private int status;
}
