package exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

import message.FileMessage;

public class FileUploadException {
	@ExceptionHandler(MaxUploadSizeExceededException.class)
	public ResponseEntity<FileMessage> maxSizeException(MaxUploadSizeExceededException exc) {
		return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED)
				.body(new FileMessage("Uno o mas archivos exceden el tamaño maximo"));
	}
}
