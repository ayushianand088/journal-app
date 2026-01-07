package com.projects.journalApp.service;

import java.util.stream.Stream;
import com.projects.journalApp.entity.User;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

public class UserArgumentProvider implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception{
        return Stream.of(
                Arguments.of(User.builder().userName("ayushi").password("ayushi").build()),
                Arguments.of(User.builder().userName("Anand").password("Anand").build())
        );
    }
}
