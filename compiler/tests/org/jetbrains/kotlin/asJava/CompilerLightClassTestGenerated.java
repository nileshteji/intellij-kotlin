/*
 * Copyright 2010-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.asJava;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/asJava/lightClasses")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class CompilerLightClassTestGenerated extends AbstractCompilerLightClassTest {
    public void testAllFilesPresentInLightClasses() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/asJava/lightClasses"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true, "local");
    }

    @TestMetadata("AnnotationClass.kt")
    public void testAnnotationClass() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/AnnotationClass.kt");
        doTest(fileName);
    }

    @TestMetadata("DeprecatedEnumEntry.kt")
    public void testDeprecatedEnumEntry() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/DeprecatedEnumEntry.kt");
        doTest(fileName);
    }

    @TestMetadata("DollarsInName.kt")
    public void testDollarsInName() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/DollarsInName.kt");
        doTest(fileName);
    }

    @TestMetadata("DollarsInNameNoPackage.kt")
    public void testDollarsInNameNoPackage() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/DollarsInNameNoPackage.kt");
        doTest(fileName);
    }

    @TestMetadata("JvmNameOnMember.kt")
    public void testJvmNameOnMember() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/JvmNameOnMember.kt");
        doTest(fileName);
    }

    @TestMetadata("JvmStatic.kt")
    public void testJvmStatic() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/JvmStatic.kt");
        doTest(fileName);
    }

    @TestMetadata("NestedObjects.kt")
    public void testNestedObjects() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/NestedObjects.kt");
        doTest(fileName);
    }

    @TestMetadata("PublishedApi.kt")
    public void testPublishedApi() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/PublishedApi.kt");
        doTest(fileName);
    }

    @TestMetadata("compiler/testData/asJava/lightClasses/compilationErrors")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class CompilationErrors extends AbstractCompilerLightClassTest {
        public void testAllFilesPresentInCompilationErrors() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/asJava/lightClasses/compilationErrors"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("AnnotationModifiers.kt")
        public void testAnnotationModifiers() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/compilationErrors/AnnotationModifiers.kt");
            doTest(fileName);
        }

        @TestMetadata("SameName.kt")
        public void testSameName() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/compilationErrors/SameName.kt");
            doTest(fileName);
        }

        @TestMetadata("TopLevelDestructuring.kt")
        public void testTopLevelDestructuring() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/compilationErrors/TopLevelDestructuring.kt");
            doTest(fileName);
        }

        @TestMetadata("WrongAnnotations.kt")
        public void testWrongAnnotations() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/compilationErrors/WrongAnnotations.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/asJava/lightClasses/delegation")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Delegation extends AbstractCompilerLightClassTest {
        public void testAllFilesPresentInDelegation() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/asJava/lightClasses/delegation"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("Function.kt")
        public void testFunction() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/delegation/Function.kt");
            doTest(fileName);
        }

        @TestMetadata("Property.kt")
        public void testProperty() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/delegation/Property.kt");
            doTest(fileName);
        }

        @TestMetadata("WithPlatformTypes.NoCompile.kt")
        public void testWithPlatformTypes_NoCompile() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/delegation/WithPlatformTypes.NoCompile.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/asJava/lightClasses/facades")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Facades extends AbstractCompilerLightClassTest {
        public void testAllFilesPresentInFacades() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/asJava/lightClasses/facades"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("EmptyFile.NoCompile.kt")
        public void testEmptyFile_NoCompile() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/facades/EmptyFile.NoCompile.kt");
            doTest(fileName);
        }

        @TestMetadata("MultiFile.kt")
        public void testMultiFile() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/facades/MultiFile.kt");
            doTest(fileName);
        }

        @TestMetadata("SingleFile.kt")
        public void testSingleFile() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/facades/SingleFile.kt");
            doTest(fileName);
        }

        @TestMetadata("SingleJvmClassName.kt")
        public void testSingleJvmClassName() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/facades/SingleJvmClassName.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/asJava/lightClasses/nullabilityAnnotations")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class NullabilityAnnotations extends AbstractCompilerLightClassTest {
        public void testAllFilesPresentInNullabilityAnnotations() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/asJava/lightClasses/nullabilityAnnotations"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("Class.kt")
        public void testClass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/nullabilityAnnotations/Class.kt");
            doTest(fileName);
        }

        @TestMetadata("ClassObjectField.kt")
        public void testClassObjectField() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/nullabilityAnnotations/ClassObjectField.kt");
            doTest(fileName);
        }

        @TestMetadata("ClassWithConstructor.kt")
        public void testClassWithConstructor() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/nullabilityAnnotations/ClassWithConstructor.kt");
            doTest(fileName);
        }

        @TestMetadata("ClassWithConstructorAndProperties.kt")
        public void testClassWithConstructorAndProperties() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/nullabilityAnnotations/ClassWithConstructorAndProperties.kt");
            doTest(fileName);
        }

        @TestMetadata("FileFacade.kt")
        public void testFileFacade() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/nullabilityAnnotations/FileFacade.kt");
            doTest(fileName);
        }

        @TestMetadata("Generic.kt")
        public void testGeneric() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/nullabilityAnnotations/Generic.kt");
            doTest(fileName);
        }

        @TestMetadata("IntOverridesAny.kt")
        public void testIntOverridesAny() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/nullabilityAnnotations/IntOverridesAny.kt");
            doTest(fileName);
        }

        @TestMetadata("JvmOverloads.kt")
        public void testJvmOverloads() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/nullabilityAnnotations/JvmOverloads.kt");
            doTest(fileName);
        }

        @TestMetadata("NullableUnitReturn.kt")
        public void testNullableUnitReturn() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/nullabilityAnnotations/NullableUnitReturn.kt");
            doTest(fileName);
        }

        @TestMetadata("OverrideAnyWithUnit.kt")
        public void testOverrideAnyWithUnit() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/nullabilityAnnotations/OverrideAnyWithUnit.kt");
            doTest(fileName);
        }

        @TestMetadata("PlatformTypes.kt")
        public void testPlatformTypes() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/nullabilityAnnotations/PlatformTypes.kt");
            doTest(fileName);
        }

        @TestMetadata("Primitives.kt")
        public void testPrimitives() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/nullabilityAnnotations/Primitives.kt");
            doTest(fileName);
        }

        @TestMetadata("PrivateInClass.kt")
        public void testPrivateInClass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/nullabilityAnnotations/PrivateInClass.kt");
            doTest(fileName);
        }

        @TestMetadata("PrivateInTrait.NoCompile.kt")
        public void testPrivateInTrait_NoCompile() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/nullabilityAnnotations/PrivateInTrait.NoCompile.kt");
            doTest(fileName);
        }

        @TestMetadata("Synthetic.kt")
        public void testSynthetic() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/nullabilityAnnotations/Synthetic.kt");
            doTest(fileName);
        }

        @TestMetadata("Trait.kt")
        public void testTrait() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/nullabilityAnnotations/Trait.kt");
            doTest(fileName);
        }

        @TestMetadata("TraitClassObjectField.NoCompile.kt")
        public void testTraitClassObjectField_NoCompile() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/nullabilityAnnotations/TraitClassObjectField.NoCompile.kt");
            doTest(fileName);
        }

        @TestMetadata("UnitAsGenericArgument.kt")
        public void testUnitAsGenericArgument() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/nullabilityAnnotations/UnitAsGenericArgument.kt");
            doTest(fileName);
        }

        @TestMetadata("UnitParameter.kt")
        public void testUnitParameter() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/nullabilityAnnotations/UnitParameter.kt");
            doTest(fileName);
        }

        @TestMetadata("VoidReturn.kt")
        public void testVoidReturn() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/nullabilityAnnotations/VoidReturn.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/asJava/lightClasses/object")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Object extends AbstractCompilerLightClassTest {
        public void testAllFilesPresentInObject() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/asJava/lightClasses/object"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("SimpleObject.kt")
        public void testSimpleObject() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/object/SimpleObject.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/asJava/lightClasses/publicField")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class PublicField extends AbstractCompilerLightClassTest {
        public void testAllFilesPresentInPublicField() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/asJava/lightClasses/publicField"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("CompanionObject.kt")
        public void testCompanionObject() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/publicField/CompanionObject.kt");
            doTest(fileName);
        }

        @TestMetadata("Simple.kt")
        public void testSimple() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/publicField/Simple.kt");
            doTest(fileName);
        }
    }
}
