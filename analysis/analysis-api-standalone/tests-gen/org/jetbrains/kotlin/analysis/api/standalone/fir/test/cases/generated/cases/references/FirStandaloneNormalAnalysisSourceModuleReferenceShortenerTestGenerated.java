/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.standalone.fir.test.cases.generated.cases.references;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.analysis.api.standalone.fir.test.AnalysisApiFirStandaloneModeTestConfiguratorFactory;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfiguratorFactoryData;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfigurator;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.TestModuleKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.FrontendKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisSessionMode;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiMode;
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.references.AbstractReferenceShortenerTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/components/referenceShortener/referenceShortener")
@TestDataPath("$PROJECT_ROOT")
public class FirStandaloneNormalAnalysisSourceModuleReferenceShortenerTestGenerated extends AbstractReferenceShortenerTest {
    @NotNull
    @Override
    public AnalysisApiTestConfigurator getConfigurator() {
        return AnalysisApiFirStandaloneModeTestConfiguratorFactory.INSTANCE.createConfigurator(
            new AnalysisApiTestConfiguratorFactoryData(
                FrontendKind.Fir,
                TestModuleKind.Source,
                AnalysisSessionMode.Normal,
                AnalysisApiMode.Standalone
            )
        );
    }

    @Test
    public void testAllFilesPresentInReferenceShortener() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/referenceShortener/referenceShortener"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("classScopes.kt")
    public void testClassScopes() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/classScopes.kt");
    }

    @Test
    @TestMetadata("classScopes2.kt")
    public void testClassScopes2() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/classScopes2.kt");
    }

    @Test
    @TestMetadata("classScopes3.kt")
    public void testClassScopes3() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/classScopes3.kt");
    }

    @Test
    @TestMetadata("classType.kt")
    public void testClassType() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/classType.kt");
    }

    @Test
    @TestMetadata("classType2.kt")
    public void testClassType2() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/classType2.kt");
    }

    @Test
    @TestMetadata("classesWithSameName.kt")
    public void testClassesWithSameName() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/classesWithSameName.kt");
    }

    @Test
    @TestMetadata("classesWithSameName2.kt")
    public void testClassesWithSameName2() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/classesWithSameName2.kt");
    }

    @Test
    @TestMetadata("classesWithSameName3.kt")
    public void testClassesWithSameName3() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/classesWithSameName3.kt");
    }

    @Test
    @TestMetadata("classesWithSameName4.kt")
    public void testClassesWithSameName4() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/classesWithSameName4.kt");
    }

    @Test
    @TestMetadata("classesWithSameName5.kt")
    public void testClassesWithSameName5() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/classesWithSameName5.kt");
    }

    @Test
    @TestMetadata("classesWithSameName6.kt")
    public void testClassesWithSameName6() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/classesWithSameName6.kt");
    }

    @Test
    @TestMetadata("classesWithSameName7.kt")
    public void testClassesWithSameName7() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/classesWithSameName7.kt");
    }

    @Test
    @TestMetadata("classesWithSameName8.kt")
    public void testClassesWithSameName8() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/classesWithSameName8.kt");
    }

    @Test
    @TestMetadata("classesWithSameName9.kt")
    public void testClassesWithSameName9() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/classesWithSameName9.kt");
    }

    @Test
    @TestMetadata("companionClassLiteral.kt")
    public void testCompanionClassLiteral() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/companionClassLiteral.kt");
    }

    @Test
    @TestMetadata("companionClassLiteral2.kt")
    public void testCompanionClassLiteral2() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/companionClassLiteral2.kt");
    }

    @Test
    @TestMetadata("companionClassLiteral3.kt")
    public void testCompanionClassLiteral3() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/companionClassLiteral3.kt");
    }

    @Test
    @TestMetadata("companionQualifier.kt")
    public void testCompanionQualifier() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/companionQualifier.kt");
    }

    @Test
    @TestMetadata("companionUsedOutOfClass.kt")
    public void testCompanionUsedOutOfClass() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/companionUsedOutOfClass.kt");
    }

    @Test
    @TestMetadata("contextReceiver.kt")
    public void testContextReceiver() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/contextReceiver.kt");
    }

    @Test
    @TestMetadata("enumClassCompanionAlreadyImported.kt")
    public void testEnumClassCompanionAlreadyImported() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/enumClassCompanionAlreadyImported.kt");
    }

    @Test
    @TestMetadata("enumEntryInitUsesCompanion.kt")
    public void testEnumEntryInitUsesCompanion() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/enumEntryInitUsesCompanion.kt");
    }

    @Test
    @TestMetadata("enumEntryInitUsesCompanion2.kt")
    public void testEnumEntryInitUsesCompanion2() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/enumEntryInitUsesCompanion2.kt");
    }

    @Test
    @TestMetadata("nestedClass.kt")
    public void testNestedClass() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/nestedClass.kt");
    }

    @Test
    @TestMetadata("nestedClass2.kt")
    public void testNestedClass2() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/nestedClass2.kt");
    }

    @Test
    @TestMetadata("nestedClass3.kt")
    public void testNestedClass3() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/nestedClass3.kt");
    }

    @Test
    @TestMetadata("nestedClassFromSupertypes.kt")
    public void testNestedClassFromSupertypes() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/nestedClassFromSupertypes.kt");
    }

    @Test
    @TestMetadata("nestedClassFromSupertypes2.kt")
    public void testNestedClassFromSupertypes2() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/nestedClassFromSupertypes2.kt");
    }

    @Test
    @TestMetadata("nestedClassFromSupertypes3.kt")
    public void testNestedClassFromSupertypes3() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/nestedClassFromSupertypes3.kt");
    }

    @Test
    @TestMetadata("nestedClassFromSupertypes4.kt")
    public void testNestedClassFromSupertypes4() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/nestedClassFromSupertypes4.kt");
    }

    @Test
    @TestMetadata("nestedClassFromSupertypes5.kt")
    public void testNestedClassFromSupertypes5() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/nestedClassFromSupertypes5.kt");
    }

    @Test
    @TestMetadata("nestedClassFromSupertypes6.kt")
    public void testNestedClassFromSupertypes6() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/nestedClassFromSupertypes6.kt");
    }

    @Test
    @TestMetadata("parameterTypeTopLevelTypeLoses.kt")
    public void testParameterTypeTopLevelTypeLoses() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/parameterTypeTopLevelTypeLoses.kt");
    }

    @Test
    @TestMetadata("receiver.kt")
    public void testReceiver() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/receiver.kt");
    }

    @Test
    @TestMetadata("receiver2.kt")
    public void testReceiver2() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/receiver2.kt");
    }

    @Test
    @TestMetadata("receiver3.kt")
    public void testReceiver3() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/receiver3.kt");
    }

    @Test
    @TestMetadata("receiver4.kt")
    public void testReceiver4() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/receiver4.kt");
    }

    @Test
    @TestMetadata("referenceInNestedClass.kt")
    public void testReferenceInNestedClass() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/referenceInNestedClass.kt");
    }

    @Test
    @TestMetadata("sameNameDifferentParams.kt")
    public void testSameNameDifferentParams() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/sameNameDifferentParams.kt");
    }

    @Test
    @TestMetadata("sameNameDifferentReceiver.kt")
    public void testSameNameDifferentReceiver() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/sameNameDifferentReceiver.kt");
    }

    @Test
    @TestMetadata("sameTypeNamesWithinSameScopes.kt")
    public void testSameTypeNamesWithinSameScopes() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/sameTypeNamesWithinSameScopes.kt");
    }

    @Test
    @TestMetadata("shortenAlreadyImportedClass.kt")
    public void testShortenAlreadyImportedClass() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/shortenAlreadyImportedClass.kt");
    }

    @Test
    @TestMetadata("shortenAlreadyImportedClass2.kt")
    public void testShortenAlreadyImportedClass2() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/shortenAlreadyImportedClass2.kt");
    }

    @Test
    @TestMetadata("shortenAlreadyImportedFunction.kt")
    public void testShortenAlreadyImportedFunction() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/shortenAlreadyImportedFunction.kt");
    }

    @Test
    @TestMetadata("shortenAlreadyImportedFunction2.kt")
    public void testShortenAlreadyImportedFunction2() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/shortenAlreadyImportedFunction2.kt");
    }

    @Test
    @TestMetadata("shortenAlreadyImportedFunction3.kt")
    public void testShortenAlreadyImportedFunction3() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/shortenAlreadyImportedFunction3.kt");
    }

    @Test
    @TestMetadata("shortenAlreadyImportedFunction4.kt")
    public void testShortenAlreadyImportedFunction4() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/shortenAlreadyImportedFunction4.kt");
    }

    @Test
    @TestMetadata("superClass.kt")
    public void testSuperClass() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/superClass.kt");
    }

    @Test
    @TestMetadata("typeParams.kt")
    public void testTypeParams() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/typeParams.kt");
    }

    @Test
    @TestMetadata("typeParams2.kt")
    public void testTypeParams2() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/typeParams2.kt");
    }

    @Test
    @TestMetadata("variable.kt")
    public void testVariable() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/variable.kt");
    }

    @Test
    @TestMetadata("variable2.kt")
    public void testVariable2() throws Exception {
        runTest("analysis/analysis-api/testData/components/referenceShortener/referenceShortener/variable2.kt");
    }
}
