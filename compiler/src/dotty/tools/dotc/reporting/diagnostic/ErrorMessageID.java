package dotty.tools.dotc.reporting.diagnostic;

/** Unique IDs identifying the messages */
public enum ErrorMessageID {

    // IMPORTANT: Add new IDs only at the end and never remove IDs

    LazyErrorId, // // errorNumber: -2
    NoExplanationID, // errorNumber: -1

    EmptyCatchOrFinallyBlockID, // errorNumber: 0
    EmptyCatchBlockID, // errorNumber: 1
    EmptyCatchAndFinallyBlockID, // errorNumber: 2
    DeprecatedWithOperatorID,
    CaseClassMissingParamListID,
    DuplicateBindID,
    MissingIdentID,
    TypeMismatchID,
    NotAMemberID,
    EarlyDefinitionsNotSupportedID,
    TopLevelImplicitClassID,
    ImplicitCaseClassID,
    ObjectMayNotHaveSelfTypeID,
    TupleTooLongID,
    RepeatedModifierID,
    InterpolatedStringErrorID,
    UnboundPlaceholderParameterID,
    IllegalStartSimpleExprID,
    MissingReturnTypeID,
    YieldOrDoExpectedInForComprehensionID,
    ProperDefinitionNotFoundID,
    ByNameParameterNotSupportedID,
    WrongNumberOfTypeArgsID,
    IllegalVariableInPatternAlternativeID,
    TypeParamsTypeExpectedID,
    IdentifierExpectedID,
    AuxConstructorNeedsNonImplicitParameterID,
    IncorrectRepeatedParameterSyntaxID,
    IllegalLiteralID,
    PatternMatchExhaustivityID,
    MatchCaseUnreachableID,
    SeqWildcardPatternPosID,
    IllegalStartOfSimplePatternID,
    PkgDuplicateSymbolID,
    ExistentialTypesNoLongerSupportedID,
    UnboundWildcardTypeID,
    DanglingThisInPathID,
    OverridesNothingID,
    OverridesNothingButNameExistsID,
    ForwardReferenceExtendsOverDefinitionID,
    ExpectedTokenButFoundID,
    MixedLeftAndRightAssociativeOpsID,
    CantInstantiateAbstractClassOrTraitID,
    AnnotatedPrimaryConstructorRequiresModifierOrThisID,
    OverloadedMethodNeedsResultTypeID,
    RecursiveMethodNeedsResultTypeID,
    RecursiveValueNeedsResultTypeID,
    CyclicReferenceInvolvingID,
    CyclicReferenceInvolvingImplicitID,
    ;

    public int errorNumber() {
        return ordinal() - 2;
    }

}
