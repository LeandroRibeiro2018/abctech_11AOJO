package br.com.fiap.abctechapi.application;

import br.com.fiap.abctechapi.application.dto.AssistResponseDto;
import br.com.fiap.abctechapi.application.impl.AssistanceApplicationImpl;
import br.com.fiap.abctechapi.service.AssistanceService;
import br.com.fiap.abctechapi.entity.Assistance;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.*;
@SpringBootTest
class AssistanceApplicationImplTest {
   @MockBean
    private AssistanceApplicationImpl assistanceApplication;

   @MockBean
    private AssistanceService assistanceService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        assistanceApplication = new AssistanceApplicationImpl(assistanceService);
    }



    @Test
    void getAssists_ReturnsListOfAssistResponseDto() {
        // Arrange
        List<Assistance> assistResponseDtos = Arrays.asList(
                new Assistance(1L, "Assist1", "Description1"),
                new Assistance(2L, "Assist2", "Description2")
                );
        Mockito.when(assistanceService.getAssists()).thenReturn(assistResponseDtos);

        // Act
        List<AssistResponseDto> actualAssistResponseDtos = assistanceApplication.getAssists();

        // Assert
        assertNotEquals(assistResponseDtos, actualAssistResponseDtos);
        verify(assistanceService, times(1)).getAssists();
    }
}
