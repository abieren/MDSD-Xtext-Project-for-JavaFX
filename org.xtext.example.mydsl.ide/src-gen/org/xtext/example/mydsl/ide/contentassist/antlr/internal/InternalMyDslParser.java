package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'frame'", "'{'", "'}'", "'container'", "'layout='", "'x'", "'text='", "'=x'", "','", "'textfield'", "'label'", "'button'", "'checkbox'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleDomainmodel"
    // InternalMyDsl.g:53:1: entryRuleDomainmodel : ruleDomainmodel EOF ;
    public final void entryRuleDomainmodel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleDomainmodel EOF )
            // InternalMyDsl.g:55:1: ruleDomainmodel EOF
            {
             before(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_1);
            ruleDomainmodel();

            state._fsp--;

             after(grammarAccess.getDomainmodelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // InternalMyDsl.g:62:1: ruleDomainmodel : ( ( rule__Domainmodel__ElementsAssignment )* ) ;
    public final void ruleDomainmodel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Domainmodel__ElementsAssignment )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__Domainmodel__ElementsAssignment )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Domainmodel__ElementsAssignment )* )
            // InternalMyDsl.g:68:3: ( rule__Domainmodel__ElementsAssignment )*
            {
             before(grammarAccess.getDomainmodelAccess().getElementsAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__Domainmodel__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__Domainmodel__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Domainmodel__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDomainmodelAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleType"
    // InternalMyDsl.g:78:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleType EOF )
            // InternalMyDsl.g:80:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMyDsl.g:87:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Type__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__Type__Alternatives )
            // InternalMyDsl.g:94:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleFrame"
    // InternalMyDsl.g:103:1: entryRuleFrame : ruleFrame EOF ;
    public final void entryRuleFrame() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleFrame EOF )
            // InternalMyDsl.g:105:1: ruleFrame EOF
            {
             before(grammarAccess.getFrameRule()); 
            pushFollow(FOLLOW_1);
            ruleFrame();

            state._fsp--;

             after(grammarAccess.getFrameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFrame"


    // $ANTLR start "ruleFrame"
    // InternalMyDsl.g:112:1: ruleFrame : ( ( rule__Frame__Group__0 ) ) ;
    public final void ruleFrame() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Frame__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Frame__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Frame__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Frame__Group__0 )
            {
             before(grammarAccess.getFrameAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Frame__Group__0 )
            // InternalMyDsl.g:119:4: rule__Frame__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Frame__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFrameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFrame"


    // $ANTLR start "entryRuleContainer"
    // InternalMyDsl.g:128:1: entryRuleContainer : ruleContainer EOF ;
    public final void entryRuleContainer() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleContainer EOF )
            // InternalMyDsl.g:130:1: ruleContainer EOF
            {
             before(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_1);
            ruleContainer();

            state._fsp--;

             after(grammarAccess.getContainerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // InternalMyDsl.g:137:1: ruleContainer : ( ( rule__Container__Group__0 ) ) ;
    public final void ruleContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Container__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Container__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Container__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Container__Group__0 )
            {
             before(grammarAccess.getContainerAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Container__Group__0 )
            // InternalMyDsl.g:144:4: rule__Container__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleContainerReference"
    // InternalMyDsl.g:153:1: entryRuleContainerReference : ruleContainerReference EOF ;
    public final void entryRuleContainerReference() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleContainerReference EOF )
            // InternalMyDsl.g:155:1: ruleContainerReference EOF
            {
             before(grammarAccess.getContainerReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleContainerReference();

            state._fsp--;

             after(grammarAccess.getContainerReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContainerReference"


    // $ANTLR start "ruleContainerReference"
    // InternalMyDsl.g:162:1: ruleContainerReference : ( ( rule__ContainerReference__Group__0 ) ) ;
    public final void ruleContainerReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__ContainerReference__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__ContainerReference__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__ContainerReference__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__ContainerReference__Group__0 )
            {
             before(grammarAccess.getContainerReferenceAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__ContainerReference__Group__0 )
            // InternalMyDsl.g:169:4: rule__ContainerReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ContainerReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContainerReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContainerReference"


    // $ANTLR start "entryRuleLayout"
    // InternalMyDsl.g:178:1: entryRuleLayout : ruleLayout EOF ;
    public final void entryRuleLayout() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleLayout EOF )
            // InternalMyDsl.g:180:1: ruleLayout EOF
            {
             before(grammarAccess.getLayoutRule()); 
            pushFollow(FOLLOW_1);
            ruleLayout();

            state._fsp--;

             after(grammarAccess.getLayoutRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLayout"


    // $ANTLR start "ruleLayout"
    // InternalMyDsl.g:187:1: ruleLayout : ( ( rule__Layout__Group__0 ) ) ;
    public final void ruleLayout() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Layout__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Layout__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Layout__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Layout__Group__0 )
            {
             before(grammarAccess.getLayoutAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Layout__Group__0 )
            // InternalMyDsl.g:194:4: rule__Layout__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Layout__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLayoutAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLayout"


    // $ANTLR start "entryRuleSize"
    // InternalMyDsl.g:203:1: entryRuleSize : ruleSize EOF ;
    public final void entryRuleSize() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleSize EOF )
            // InternalMyDsl.g:205:1: ruleSize EOF
            {
             before(grammarAccess.getSizeRule()); 
            pushFollow(FOLLOW_1);
            ruleSize();

            state._fsp--;

             after(grammarAccess.getSizeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSize"


    // $ANTLR start "ruleSize"
    // InternalMyDsl.g:212:1: ruleSize : ( ( rule__Size__Group__0 ) ) ;
    public final void ruleSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Size__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Size__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Size__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__Size__Group__0 )
            {
             before(grammarAccess.getSizeAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__Size__Group__0 )
            // InternalMyDsl.g:219:4: rule__Size__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Size__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSizeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSize"


    // $ANTLR start "entryRuleText"
    // InternalMyDsl.g:228:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleText EOF )
            // InternalMyDsl.g:230:1: ruleText EOF
            {
             before(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            ruleText();

            state._fsp--;

             after(grammarAccess.getTextRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalMyDsl.g:237:1: ruleText : ( ( rule__Text__Group__0 ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Text__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Text__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Text__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Text__Group__0 )
            {
             before(grammarAccess.getTextAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Text__Group__0 )
            // InternalMyDsl.g:244:4: rule__Text__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleCheckboxChoice"
    // InternalMyDsl.g:253:1: entryRuleCheckboxChoice : ruleCheckboxChoice EOF ;
    public final void entryRuleCheckboxChoice() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleCheckboxChoice EOF )
            // InternalMyDsl.g:255:1: ruleCheckboxChoice EOF
            {
             before(grammarAccess.getCheckboxChoiceRule()); 
            pushFollow(FOLLOW_1);
            ruleCheckboxChoice();

            state._fsp--;

             after(grammarAccess.getCheckboxChoiceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCheckboxChoice"


    // $ANTLR start "ruleCheckboxChoice"
    // InternalMyDsl.g:262:1: ruleCheckboxChoice : ( ( rule__CheckboxChoice__Group__0 ) ) ;
    public final void ruleCheckboxChoice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__CheckboxChoice__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__CheckboxChoice__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__CheckboxChoice__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__CheckboxChoice__Group__0 )
            {
             before(grammarAccess.getCheckboxChoiceAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__CheckboxChoice__Group__0 )
            // InternalMyDsl.g:269:4: rule__CheckboxChoice__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CheckboxChoice__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheckboxChoiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCheckboxChoice"


    // $ANTLR start "entryRuleGuiElement"
    // InternalMyDsl.g:278:1: entryRuleGuiElement : ruleGuiElement EOF ;
    public final void entryRuleGuiElement() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleGuiElement EOF )
            // InternalMyDsl.g:280:1: ruleGuiElement EOF
            {
             before(grammarAccess.getGuiElementRule()); 
            pushFollow(FOLLOW_1);
            ruleGuiElement();

            state._fsp--;

             after(grammarAccess.getGuiElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGuiElement"


    // $ANTLR start "ruleGuiElement"
    // InternalMyDsl.g:287:1: ruleGuiElement : ( ( rule__GuiElement__Alternatives ) ) ;
    public final void ruleGuiElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__GuiElement__Alternatives ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__GuiElement__Alternatives ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__GuiElement__Alternatives ) )
            // InternalMyDsl.g:293:3: ( rule__GuiElement__Alternatives )
            {
             before(grammarAccess.getGuiElementAccess().getAlternatives()); 
            // InternalMyDsl.g:294:3: ( rule__GuiElement__Alternatives )
            // InternalMyDsl.g:294:4: rule__GuiElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GuiElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGuiElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGuiElement"


    // $ANTLR start "entryRuleTextfield"
    // InternalMyDsl.g:303:1: entryRuleTextfield : ruleTextfield EOF ;
    public final void entryRuleTextfield() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleTextfield EOF )
            // InternalMyDsl.g:305:1: ruleTextfield EOF
            {
             before(grammarAccess.getTextfieldRule()); 
            pushFollow(FOLLOW_1);
            ruleTextfield();

            state._fsp--;

             after(grammarAccess.getTextfieldRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTextfield"


    // $ANTLR start "ruleTextfield"
    // InternalMyDsl.g:312:1: ruleTextfield : ( ( rule__Textfield__Group__0 ) ) ;
    public final void ruleTextfield() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__Textfield__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__Textfield__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__Textfield__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__Textfield__Group__0 )
            {
             before(grammarAccess.getTextfieldAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__Textfield__Group__0 )
            // InternalMyDsl.g:319:4: rule__Textfield__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Textfield__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextfieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextfield"


    // $ANTLR start "entryRuleLabel"
    // InternalMyDsl.g:328:1: entryRuleLabel : ruleLabel EOF ;
    public final void entryRuleLabel() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleLabel EOF )
            // InternalMyDsl.g:330:1: ruleLabel EOF
            {
             before(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getLabelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalMyDsl.g:337:1: ruleLabel : ( ( rule__Label__Group__0 ) ) ;
    public final void ruleLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__Label__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__Label__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__Label__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__Label__Group__0 )
            {
             before(grammarAccess.getLabelAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__Label__Group__0 )
            // InternalMyDsl.g:344:4: rule__Label__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Label__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleButton"
    // InternalMyDsl.g:353:1: entryRuleButton : ruleButton EOF ;
    public final void entryRuleButton() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleButton EOF )
            // InternalMyDsl.g:355:1: ruleButton EOF
            {
             before(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_1);
            ruleButton();

            state._fsp--;

             after(grammarAccess.getButtonRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // InternalMyDsl.g:362:1: ruleButton : ( ( rule__Button__Group__0 ) ) ;
    public final void ruleButton() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__Button__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__Button__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__Button__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__Button__Group__0 )
            {
             before(grammarAccess.getButtonAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__Button__Group__0 )
            // InternalMyDsl.g:369:4: rule__Button__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Button__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRuleCheckbox"
    // InternalMyDsl.g:378:1: entryRuleCheckbox : ruleCheckbox EOF ;
    public final void entryRuleCheckbox() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleCheckbox EOF )
            // InternalMyDsl.g:380:1: ruleCheckbox EOF
            {
             before(grammarAccess.getCheckboxRule()); 
            pushFollow(FOLLOW_1);
            ruleCheckbox();

            state._fsp--;

             after(grammarAccess.getCheckboxRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCheckbox"


    // $ANTLR start "ruleCheckbox"
    // InternalMyDsl.g:387:1: ruleCheckbox : ( ( rule__Checkbox__Group__0 ) ) ;
    public final void ruleCheckbox() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__Checkbox__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__Checkbox__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__Checkbox__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__Checkbox__Group__0 )
            {
             before(grammarAccess.getCheckboxAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__Checkbox__Group__0 )
            // InternalMyDsl.g:394:4: rule__Checkbox__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Checkbox__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheckboxAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCheckbox"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalMyDsl.g:402:1: rule__Type__Alternatives : ( ( ruleFrame ) | ( ruleContainer ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:406:1: ( ( ruleFrame ) | ( ruleContainer ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:407:2: ( ruleFrame )
                    {
                    // InternalMyDsl.g:407:2: ( ruleFrame )
                    // InternalMyDsl.g:408:3: ruleFrame
                    {
                     before(grammarAccess.getTypeAccess().getFrameParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFrame();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getFrameParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:413:2: ( ruleContainer )
                    {
                    // InternalMyDsl.g:413:2: ( ruleContainer )
                    // InternalMyDsl.g:414:3: ruleContainer
                    {
                     before(grammarAccess.getTypeAccess().getContainerParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleContainer();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getContainerParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__GuiElement__Alternatives"
    // InternalMyDsl.g:423:1: rule__GuiElement__Alternatives : ( ( ruleTextfield ) | ( ruleLabel ) | ( ruleButton ) | ( ruleCheckbox ) | ( ruleContainerReference ) );
    public final void rule__GuiElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:427:1: ( ( ruleTextfield ) | ( ruleLabel ) | ( ruleButton ) | ( ruleCheckbox ) | ( ruleContainerReference ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt3=1;
                }
                break;
            case 21:
                {
                alt3=2;
                }
                break;
            case 22:
                {
                alt3=3;
                }
                break;
            case 23:
                {
                alt3=4;
                }
                break;
            case RULE_ID:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:428:2: ( ruleTextfield )
                    {
                    // InternalMyDsl.g:428:2: ( ruleTextfield )
                    // InternalMyDsl.g:429:3: ruleTextfield
                    {
                     before(grammarAccess.getGuiElementAccess().getTextfieldParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTextfield();

                    state._fsp--;

                     after(grammarAccess.getGuiElementAccess().getTextfieldParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:434:2: ( ruleLabel )
                    {
                    // InternalMyDsl.g:434:2: ( ruleLabel )
                    // InternalMyDsl.g:435:3: ruleLabel
                    {
                     before(grammarAccess.getGuiElementAccess().getLabelParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLabel();

                    state._fsp--;

                     after(grammarAccess.getGuiElementAccess().getLabelParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:440:2: ( ruleButton )
                    {
                    // InternalMyDsl.g:440:2: ( ruleButton )
                    // InternalMyDsl.g:441:3: ruleButton
                    {
                     before(grammarAccess.getGuiElementAccess().getButtonParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleButton();

                    state._fsp--;

                     after(grammarAccess.getGuiElementAccess().getButtonParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:446:2: ( ruleCheckbox )
                    {
                    // InternalMyDsl.g:446:2: ( ruleCheckbox )
                    // InternalMyDsl.g:447:3: ruleCheckbox
                    {
                     before(grammarAccess.getGuiElementAccess().getCheckboxParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCheckbox();

                    state._fsp--;

                     after(grammarAccess.getGuiElementAccess().getCheckboxParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:452:2: ( ruleContainerReference )
                    {
                    // InternalMyDsl.g:452:2: ( ruleContainerReference )
                    // InternalMyDsl.g:453:3: ruleContainerReference
                    {
                     before(grammarAccess.getGuiElementAccess().getContainerReferenceParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleContainerReference();

                    state._fsp--;

                     after(grammarAccess.getGuiElementAccess().getContainerReferenceParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuiElement__Alternatives"


    // $ANTLR start "rule__Frame__Group__0"
    // InternalMyDsl.g:462:1: rule__Frame__Group__0 : rule__Frame__Group__0__Impl rule__Frame__Group__1 ;
    public final void rule__Frame__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:1: ( rule__Frame__Group__0__Impl rule__Frame__Group__1 )
            // InternalMyDsl.g:467:2: rule__Frame__Group__0__Impl rule__Frame__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Frame__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frame__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__0"


    // $ANTLR start "rule__Frame__Group__0__Impl"
    // InternalMyDsl.g:474:1: rule__Frame__Group__0__Impl : ( 'frame' ) ;
    public final void rule__Frame__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:478:1: ( ( 'frame' ) )
            // InternalMyDsl.g:479:1: ( 'frame' )
            {
            // InternalMyDsl.g:479:1: ( 'frame' )
            // InternalMyDsl.g:480:2: 'frame'
            {
             before(grammarAccess.getFrameAccess().getFrameKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getFrameAccess().getFrameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__0__Impl"


    // $ANTLR start "rule__Frame__Group__1"
    // InternalMyDsl.g:489:1: rule__Frame__Group__1 : rule__Frame__Group__1__Impl rule__Frame__Group__2 ;
    public final void rule__Frame__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:493:1: ( rule__Frame__Group__1__Impl rule__Frame__Group__2 )
            // InternalMyDsl.g:494:2: rule__Frame__Group__1__Impl rule__Frame__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Frame__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frame__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__1"


    // $ANTLR start "rule__Frame__Group__1__Impl"
    // InternalMyDsl.g:501:1: rule__Frame__Group__1__Impl : ( ( rule__Frame__NameAssignment_1 ) ) ;
    public final void rule__Frame__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:505:1: ( ( ( rule__Frame__NameAssignment_1 ) ) )
            // InternalMyDsl.g:506:1: ( ( rule__Frame__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:506:1: ( ( rule__Frame__NameAssignment_1 ) )
            // InternalMyDsl.g:507:2: ( rule__Frame__NameAssignment_1 )
            {
             before(grammarAccess.getFrameAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:508:2: ( rule__Frame__NameAssignment_1 )
            // InternalMyDsl.g:508:3: rule__Frame__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Frame__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFrameAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__1__Impl"


    // $ANTLR start "rule__Frame__Group__2"
    // InternalMyDsl.g:516:1: rule__Frame__Group__2 : rule__Frame__Group__2__Impl rule__Frame__Group__3 ;
    public final void rule__Frame__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:520:1: ( rule__Frame__Group__2__Impl rule__Frame__Group__3 )
            // InternalMyDsl.g:521:2: rule__Frame__Group__2__Impl rule__Frame__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Frame__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frame__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__2"


    // $ANTLR start "rule__Frame__Group__2__Impl"
    // InternalMyDsl.g:528:1: rule__Frame__Group__2__Impl : ( '{' ) ;
    public final void rule__Frame__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:532:1: ( ( '{' ) )
            // InternalMyDsl.g:533:1: ( '{' )
            {
            // InternalMyDsl.g:533:1: ( '{' )
            // InternalMyDsl.g:534:2: '{'
            {
             before(grammarAccess.getFrameAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getFrameAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__2__Impl"


    // $ANTLR start "rule__Frame__Group__3"
    // InternalMyDsl.g:543:1: rule__Frame__Group__3 : rule__Frame__Group__3__Impl rule__Frame__Group__4 ;
    public final void rule__Frame__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:547:1: ( rule__Frame__Group__3__Impl rule__Frame__Group__4 )
            // InternalMyDsl.g:548:2: rule__Frame__Group__3__Impl rule__Frame__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Frame__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frame__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__3"


    // $ANTLR start "rule__Frame__Group__3__Impl"
    // InternalMyDsl.g:555:1: rule__Frame__Group__3__Impl : ( ( rule__Frame__SizeAssignment_3 )? ) ;
    public final void rule__Frame__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:559:1: ( ( ( rule__Frame__SizeAssignment_3 )? ) )
            // InternalMyDsl.g:560:1: ( ( rule__Frame__SizeAssignment_3 )? )
            {
            // InternalMyDsl.g:560:1: ( ( rule__Frame__SizeAssignment_3 )? )
            // InternalMyDsl.g:561:2: ( rule__Frame__SizeAssignment_3 )?
            {
             before(grammarAccess.getFrameAccess().getSizeAssignment_3()); 
            // InternalMyDsl.g:562:2: ( rule__Frame__SizeAssignment_3 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:562:3: rule__Frame__SizeAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Frame__SizeAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFrameAccess().getSizeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__3__Impl"


    // $ANTLR start "rule__Frame__Group__4"
    // InternalMyDsl.g:570:1: rule__Frame__Group__4 : rule__Frame__Group__4__Impl rule__Frame__Group__5 ;
    public final void rule__Frame__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:574:1: ( rule__Frame__Group__4__Impl rule__Frame__Group__5 )
            // InternalMyDsl.g:575:2: rule__Frame__Group__4__Impl rule__Frame__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Frame__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frame__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__4"


    // $ANTLR start "rule__Frame__Group__4__Impl"
    // InternalMyDsl.g:582:1: rule__Frame__Group__4__Impl : ( ( rule__Frame__GuielementsAssignment_4 )* ) ;
    public final void rule__Frame__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:586:1: ( ( ( rule__Frame__GuielementsAssignment_4 )* ) )
            // InternalMyDsl.g:587:1: ( ( rule__Frame__GuielementsAssignment_4 )* )
            {
            // InternalMyDsl.g:587:1: ( ( rule__Frame__GuielementsAssignment_4 )* )
            // InternalMyDsl.g:588:2: ( rule__Frame__GuielementsAssignment_4 )*
            {
             before(grammarAccess.getFrameAccess().getGuielementsAssignment_4()); 
            // InternalMyDsl.g:589:2: ( rule__Frame__GuielementsAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||(LA5_0>=20 && LA5_0<=23)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:589:3: rule__Frame__GuielementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Frame__GuielementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getFrameAccess().getGuielementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__4__Impl"


    // $ANTLR start "rule__Frame__Group__5"
    // InternalMyDsl.g:597:1: rule__Frame__Group__5 : rule__Frame__Group__5__Impl ;
    public final void rule__Frame__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:601:1: ( rule__Frame__Group__5__Impl )
            // InternalMyDsl.g:602:2: rule__Frame__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Frame__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__5"


    // $ANTLR start "rule__Frame__Group__5__Impl"
    // InternalMyDsl.g:608:1: rule__Frame__Group__5__Impl : ( '}' ) ;
    public final void rule__Frame__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:612:1: ( ( '}' ) )
            // InternalMyDsl.g:613:1: ( '}' )
            {
            // InternalMyDsl.g:613:1: ( '}' )
            // InternalMyDsl.g:614:2: '}'
            {
             before(grammarAccess.getFrameAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFrameAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__5__Impl"


    // $ANTLR start "rule__Container__Group__0"
    // InternalMyDsl.g:624:1: rule__Container__Group__0 : rule__Container__Group__0__Impl rule__Container__Group__1 ;
    public final void rule__Container__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:628:1: ( rule__Container__Group__0__Impl rule__Container__Group__1 )
            // InternalMyDsl.g:629:2: rule__Container__Group__0__Impl rule__Container__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Container__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__0"


    // $ANTLR start "rule__Container__Group__0__Impl"
    // InternalMyDsl.g:636:1: rule__Container__Group__0__Impl : ( 'container' ) ;
    public final void rule__Container__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:640:1: ( ( 'container' ) )
            // InternalMyDsl.g:641:1: ( 'container' )
            {
            // InternalMyDsl.g:641:1: ( 'container' )
            // InternalMyDsl.g:642:2: 'container'
            {
             before(grammarAccess.getContainerAccess().getContainerKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getContainerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__0__Impl"


    // $ANTLR start "rule__Container__Group__1"
    // InternalMyDsl.g:651:1: rule__Container__Group__1 : rule__Container__Group__1__Impl rule__Container__Group__2 ;
    public final void rule__Container__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:655:1: ( rule__Container__Group__1__Impl rule__Container__Group__2 )
            // InternalMyDsl.g:656:2: rule__Container__Group__1__Impl rule__Container__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Container__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__1"


    // $ANTLR start "rule__Container__Group__1__Impl"
    // InternalMyDsl.g:663:1: rule__Container__Group__1__Impl : ( ( rule__Container__ContainerNameAssignment_1 ) ) ;
    public final void rule__Container__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:667:1: ( ( ( rule__Container__ContainerNameAssignment_1 ) ) )
            // InternalMyDsl.g:668:1: ( ( rule__Container__ContainerNameAssignment_1 ) )
            {
            // InternalMyDsl.g:668:1: ( ( rule__Container__ContainerNameAssignment_1 ) )
            // InternalMyDsl.g:669:2: ( rule__Container__ContainerNameAssignment_1 )
            {
             before(grammarAccess.getContainerAccess().getContainerNameAssignment_1()); 
            // InternalMyDsl.g:670:2: ( rule__Container__ContainerNameAssignment_1 )
            // InternalMyDsl.g:670:3: rule__Container__ContainerNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Container__ContainerNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getContainerNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__1__Impl"


    // $ANTLR start "rule__Container__Group__2"
    // InternalMyDsl.g:678:1: rule__Container__Group__2 : rule__Container__Group__2__Impl rule__Container__Group__3 ;
    public final void rule__Container__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:682:1: ( rule__Container__Group__2__Impl rule__Container__Group__3 )
            // InternalMyDsl.g:683:2: rule__Container__Group__2__Impl rule__Container__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Container__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__2"


    // $ANTLR start "rule__Container__Group__2__Impl"
    // InternalMyDsl.g:690:1: rule__Container__Group__2__Impl : ( '{' ) ;
    public final void rule__Container__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:694:1: ( ( '{' ) )
            // InternalMyDsl.g:695:1: ( '{' )
            {
            // InternalMyDsl.g:695:1: ( '{' )
            // InternalMyDsl.g:696:2: '{'
            {
             before(grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__2__Impl"


    // $ANTLR start "rule__Container__Group__3"
    // InternalMyDsl.g:705:1: rule__Container__Group__3 : rule__Container__Group__3__Impl rule__Container__Group__4 ;
    public final void rule__Container__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:709:1: ( rule__Container__Group__3__Impl rule__Container__Group__4 )
            // InternalMyDsl.g:710:2: rule__Container__Group__3__Impl rule__Container__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Container__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__3"


    // $ANTLR start "rule__Container__Group__3__Impl"
    // InternalMyDsl.g:717:1: rule__Container__Group__3__Impl : ( ( rule__Container__SizeAssignment_3 )? ) ;
    public final void rule__Container__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:721:1: ( ( ( rule__Container__SizeAssignment_3 )? ) )
            // InternalMyDsl.g:722:1: ( ( rule__Container__SizeAssignment_3 )? )
            {
            // InternalMyDsl.g:722:1: ( ( rule__Container__SizeAssignment_3 )? )
            // InternalMyDsl.g:723:2: ( rule__Container__SizeAssignment_3 )?
            {
             before(grammarAccess.getContainerAccess().getSizeAssignment_3()); 
            // InternalMyDsl.g:724:2: ( rule__Container__SizeAssignment_3 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:724:3: rule__Container__SizeAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Container__SizeAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContainerAccess().getSizeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__3__Impl"


    // $ANTLR start "rule__Container__Group__4"
    // InternalMyDsl.g:732:1: rule__Container__Group__4 : rule__Container__Group__4__Impl rule__Container__Group__5 ;
    public final void rule__Container__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:736:1: ( rule__Container__Group__4__Impl rule__Container__Group__5 )
            // InternalMyDsl.g:737:2: rule__Container__Group__4__Impl rule__Container__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Container__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__4"


    // $ANTLR start "rule__Container__Group__4__Impl"
    // InternalMyDsl.g:744:1: rule__Container__Group__4__Impl : ( ( rule__Container__LayoutAssignment_4 )? ) ;
    public final void rule__Container__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:748:1: ( ( ( rule__Container__LayoutAssignment_4 )? ) )
            // InternalMyDsl.g:749:1: ( ( rule__Container__LayoutAssignment_4 )? )
            {
            // InternalMyDsl.g:749:1: ( ( rule__Container__LayoutAssignment_4 )? )
            // InternalMyDsl.g:750:2: ( rule__Container__LayoutAssignment_4 )?
            {
             before(grammarAccess.getContainerAccess().getLayoutAssignment_4()); 
            // InternalMyDsl.g:751:2: ( rule__Container__LayoutAssignment_4 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:751:3: rule__Container__LayoutAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Container__LayoutAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContainerAccess().getLayoutAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__4__Impl"


    // $ANTLR start "rule__Container__Group__5"
    // InternalMyDsl.g:759:1: rule__Container__Group__5 : rule__Container__Group__5__Impl rule__Container__Group__6 ;
    public final void rule__Container__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:763:1: ( rule__Container__Group__5__Impl rule__Container__Group__6 )
            // InternalMyDsl.g:764:2: rule__Container__Group__5__Impl rule__Container__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Container__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__5"


    // $ANTLR start "rule__Container__Group__5__Impl"
    // InternalMyDsl.g:771:1: rule__Container__Group__5__Impl : ( ( rule__Container__GuielementsAssignment_5 )* ) ;
    public final void rule__Container__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:775:1: ( ( ( rule__Container__GuielementsAssignment_5 )* ) )
            // InternalMyDsl.g:776:1: ( ( rule__Container__GuielementsAssignment_5 )* )
            {
            // InternalMyDsl.g:776:1: ( ( rule__Container__GuielementsAssignment_5 )* )
            // InternalMyDsl.g:777:2: ( rule__Container__GuielementsAssignment_5 )*
            {
             before(grammarAccess.getContainerAccess().getGuielementsAssignment_5()); 
            // InternalMyDsl.g:778:2: ( rule__Container__GuielementsAssignment_5 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||(LA8_0>=20 && LA8_0<=23)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:778:3: rule__Container__GuielementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Container__GuielementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getContainerAccess().getGuielementsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__5__Impl"


    // $ANTLR start "rule__Container__Group__6"
    // InternalMyDsl.g:786:1: rule__Container__Group__6 : rule__Container__Group__6__Impl ;
    public final void rule__Container__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:790:1: ( rule__Container__Group__6__Impl )
            // InternalMyDsl.g:791:2: rule__Container__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__6"


    // $ANTLR start "rule__Container__Group__6__Impl"
    // InternalMyDsl.g:797:1: rule__Container__Group__6__Impl : ( '}' ) ;
    public final void rule__Container__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:801:1: ( ( '}' ) )
            // InternalMyDsl.g:802:1: ( '}' )
            {
            // InternalMyDsl.g:802:1: ( '}' )
            // InternalMyDsl.g:803:2: '}'
            {
             before(grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__6__Impl"


    // $ANTLR start "rule__ContainerReference__Group__0"
    // InternalMyDsl.g:813:1: rule__ContainerReference__Group__0 : rule__ContainerReference__Group__0__Impl rule__ContainerReference__Group__1 ;
    public final void rule__ContainerReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:817:1: ( rule__ContainerReference__Group__0__Impl rule__ContainerReference__Group__1 )
            // InternalMyDsl.g:818:2: rule__ContainerReference__Group__0__Impl rule__ContainerReference__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ContainerReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContainerReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainerReference__Group__0"


    // $ANTLR start "rule__ContainerReference__Group__0__Impl"
    // InternalMyDsl.g:825:1: rule__ContainerReference__Group__0__Impl : ( ( rule__ContainerReference__ReferenceNameAssignment_0 ) ) ;
    public final void rule__ContainerReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:829:1: ( ( ( rule__ContainerReference__ReferenceNameAssignment_0 ) ) )
            // InternalMyDsl.g:830:1: ( ( rule__ContainerReference__ReferenceNameAssignment_0 ) )
            {
            // InternalMyDsl.g:830:1: ( ( rule__ContainerReference__ReferenceNameAssignment_0 ) )
            // InternalMyDsl.g:831:2: ( rule__ContainerReference__ReferenceNameAssignment_0 )
            {
             before(grammarAccess.getContainerReferenceAccess().getReferenceNameAssignment_0()); 
            // InternalMyDsl.g:832:2: ( rule__ContainerReference__ReferenceNameAssignment_0 )
            // InternalMyDsl.g:832:3: rule__ContainerReference__ReferenceNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ContainerReference__ReferenceNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getContainerReferenceAccess().getReferenceNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainerReference__Group__0__Impl"


    // $ANTLR start "rule__ContainerReference__Group__1"
    // InternalMyDsl.g:840:1: rule__ContainerReference__Group__1 : rule__ContainerReference__Group__1__Impl ;
    public final void rule__ContainerReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:844:1: ( rule__ContainerReference__Group__1__Impl )
            // InternalMyDsl.g:845:2: rule__ContainerReference__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContainerReference__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainerReference__Group__1"


    // $ANTLR start "rule__ContainerReference__Group__1__Impl"
    // InternalMyDsl.g:851:1: rule__ContainerReference__Group__1__Impl : ( ( rule__ContainerReference__NameAssignment_1 ) ) ;
    public final void rule__ContainerReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:855:1: ( ( ( rule__ContainerReference__NameAssignment_1 ) ) )
            // InternalMyDsl.g:856:1: ( ( rule__ContainerReference__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:856:1: ( ( rule__ContainerReference__NameAssignment_1 ) )
            // InternalMyDsl.g:857:2: ( rule__ContainerReference__NameAssignment_1 )
            {
             before(grammarAccess.getContainerReferenceAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:858:2: ( rule__ContainerReference__NameAssignment_1 )
            // InternalMyDsl.g:858:3: rule__ContainerReference__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ContainerReference__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getContainerReferenceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainerReference__Group__1__Impl"


    // $ANTLR start "rule__Layout__Group__0"
    // InternalMyDsl.g:867:1: rule__Layout__Group__0 : rule__Layout__Group__0__Impl rule__Layout__Group__1 ;
    public final void rule__Layout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:871:1: ( rule__Layout__Group__0__Impl rule__Layout__Group__1 )
            // InternalMyDsl.g:872:2: rule__Layout__Group__0__Impl rule__Layout__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Layout__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layout__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__0"


    // $ANTLR start "rule__Layout__Group__0__Impl"
    // InternalMyDsl.g:879:1: rule__Layout__Group__0__Impl : ( 'layout=' ) ;
    public final void rule__Layout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:883:1: ( ( 'layout=' ) )
            // InternalMyDsl.g:884:1: ( 'layout=' )
            {
            // InternalMyDsl.g:884:1: ( 'layout=' )
            // InternalMyDsl.g:885:2: 'layout='
            {
             before(grammarAccess.getLayoutAccess().getLayoutKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLayoutAccess().getLayoutKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__0__Impl"


    // $ANTLR start "rule__Layout__Group__1"
    // InternalMyDsl.g:894:1: rule__Layout__Group__1 : rule__Layout__Group__1__Impl ;
    public final void rule__Layout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:898:1: ( rule__Layout__Group__1__Impl )
            // InternalMyDsl.g:899:2: rule__Layout__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Layout__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__1"


    // $ANTLR start "rule__Layout__Group__1__Impl"
    // InternalMyDsl.g:905:1: rule__Layout__Group__1__Impl : ( ( rule__Layout__LayoutAssignment_1 ) ) ;
    public final void rule__Layout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:909:1: ( ( ( rule__Layout__LayoutAssignment_1 ) ) )
            // InternalMyDsl.g:910:1: ( ( rule__Layout__LayoutAssignment_1 ) )
            {
            // InternalMyDsl.g:910:1: ( ( rule__Layout__LayoutAssignment_1 ) )
            // InternalMyDsl.g:911:2: ( rule__Layout__LayoutAssignment_1 )
            {
             before(grammarAccess.getLayoutAccess().getLayoutAssignment_1()); 
            // InternalMyDsl.g:912:2: ( rule__Layout__LayoutAssignment_1 )
            // InternalMyDsl.g:912:3: rule__Layout__LayoutAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Layout__LayoutAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLayoutAccess().getLayoutAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__1__Impl"


    // $ANTLR start "rule__Size__Group__0"
    // InternalMyDsl.g:921:1: rule__Size__Group__0 : rule__Size__Group__0__Impl rule__Size__Group__1 ;
    public final void rule__Size__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:925:1: ( rule__Size__Group__0__Impl rule__Size__Group__1 )
            // InternalMyDsl.g:926:2: rule__Size__Group__0__Impl rule__Size__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Size__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Size__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__0"


    // $ANTLR start "rule__Size__Group__0__Impl"
    // InternalMyDsl.g:933:1: rule__Size__Group__0__Impl : ( ( rule__Size__WidthAssignment_0 ) ) ;
    public final void rule__Size__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:937:1: ( ( ( rule__Size__WidthAssignment_0 ) ) )
            // InternalMyDsl.g:938:1: ( ( rule__Size__WidthAssignment_0 ) )
            {
            // InternalMyDsl.g:938:1: ( ( rule__Size__WidthAssignment_0 ) )
            // InternalMyDsl.g:939:2: ( rule__Size__WidthAssignment_0 )
            {
             before(grammarAccess.getSizeAccess().getWidthAssignment_0()); 
            // InternalMyDsl.g:940:2: ( rule__Size__WidthAssignment_0 )
            // InternalMyDsl.g:940:3: rule__Size__WidthAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Size__WidthAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSizeAccess().getWidthAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__0__Impl"


    // $ANTLR start "rule__Size__Group__1"
    // InternalMyDsl.g:948:1: rule__Size__Group__1 : rule__Size__Group__1__Impl rule__Size__Group__2 ;
    public final void rule__Size__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:952:1: ( rule__Size__Group__1__Impl rule__Size__Group__2 )
            // InternalMyDsl.g:953:2: rule__Size__Group__1__Impl rule__Size__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Size__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Size__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__1"


    // $ANTLR start "rule__Size__Group__1__Impl"
    // InternalMyDsl.g:960:1: rule__Size__Group__1__Impl : ( 'x' ) ;
    public final void rule__Size__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:964:1: ( ( 'x' ) )
            // InternalMyDsl.g:965:1: ( 'x' )
            {
            // InternalMyDsl.g:965:1: ( 'x' )
            // InternalMyDsl.g:966:2: 'x'
            {
             before(grammarAccess.getSizeAccess().getXKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSizeAccess().getXKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__1__Impl"


    // $ANTLR start "rule__Size__Group__2"
    // InternalMyDsl.g:975:1: rule__Size__Group__2 : rule__Size__Group__2__Impl ;
    public final void rule__Size__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:979:1: ( rule__Size__Group__2__Impl )
            // InternalMyDsl.g:980:2: rule__Size__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Size__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__2"


    // $ANTLR start "rule__Size__Group__2__Impl"
    // InternalMyDsl.g:986:1: rule__Size__Group__2__Impl : ( ( rule__Size__HeightAssignment_2 ) ) ;
    public final void rule__Size__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:990:1: ( ( ( rule__Size__HeightAssignment_2 ) ) )
            // InternalMyDsl.g:991:1: ( ( rule__Size__HeightAssignment_2 ) )
            {
            // InternalMyDsl.g:991:1: ( ( rule__Size__HeightAssignment_2 ) )
            // InternalMyDsl.g:992:2: ( rule__Size__HeightAssignment_2 )
            {
             before(grammarAccess.getSizeAccess().getHeightAssignment_2()); 
            // InternalMyDsl.g:993:2: ( rule__Size__HeightAssignment_2 )
            // InternalMyDsl.g:993:3: rule__Size__HeightAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Size__HeightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSizeAccess().getHeightAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__2__Impl"


    // $ANTLR start "rule__Text__Group__0"
    // InternalMyDsl.g:1002:1: rule__Text__Group__0 : rule__Text__Group__0__Impl rule__Text__Group__1 ;
    public final void rule__Text__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1006:1: ( rule__Text__Group__0__Impl rule__Text__Group__1 )
            // InternalMyDsl.g:1007:2: rule__Text__Group__0__Impl rule__Text__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Text__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__0"


    // $ANTLR start "rule__Text__Group__0__Impl"
    // InternalMyDsl.g:1014:1: rule__Text__Group__0__Impl : ( 'text=' ) ;
    public final void rule__Text__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1018:1: ( ( 'text=' ) )
            // InternalMyDsl.g:1019:1: ( 'text=' )
            {
            // InternalMyDsl.g:1019:1: ( 'text=' )
            // InternalMyDsl.g:1020:2: 'text='
            {
             before(grammarAccess.getTextAccess().getTextKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getTextKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__0__Impl"


    // $ANTLR start "rule__Text__Group__1"
    // InternalMyDsl.g:1029:1: rule__Text__Group__1 : rule__Text__Group__1__Impl ;
    public final void rule__Text__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1033:1: ( rule__Text__Group__1__Impl )
            // InternalMyDsl.g:1034:2: rule__Text__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__1"


    // $ANTLR start "rule__Text__Group__1__Impl"
    // InternalMyDsl.g:1040:1: rule__Text__Group__1__Impl : ( ( rule__Text__TextAssignment_1 ) ) ;
    public final void rule__Text__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1044:1: ( ( ( rule__Text__TextAssignment_1 ) ) )
            // InternalMyDsl.g:1045:1: ( ( rule__Text__TextAssignment_1 ) )
            {
            // InternalMyDsl.g:1045:1: ( ( rule__Text__TextAssignment_1 ) )
            // InternalMyDsl.g:1046:2: ( rule__Text__TextAssignment_1 )
            {
             before(grammarAccess.getTextAccess().getTextAssignment_1()); 
            // InternalMyDsl.g:1047:2: ( rule__Text__TextAssignment_1 )
            // InternalMyDsl.g:1047:3: rule__Text__TextAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Text__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getTextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__1__Impl"


    // $ANTLR start "rule__CheckboxChoice__Group__0"
    // InternalMyDsl.g:1056:1: rule__CheckboxChoice__Group__0 : rule__CheckboxChoice__Group__0__Impl rule__CheckboxChoice__Group__1 ;
    public final void rule__CheckboxChoice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1060:1: ( rule__CheckboxChoice__Group__0__Impl rule__CheckboxChoice__Group__1 )
            // InternalMyDsl.g:1061:2: rule__CheckboxChoice__Group__0__Impl rule__CheckboxChoice__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__CheckboxChoice__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CheckboxChoice__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckboxChoice__Group__0"


    // $ANTLR start "rule__CheckboxChoice__Group__0__Impl"
    // InternalMyDsl.g:1068:1: rule__CheckboxChoice__Group__0__Impl : ( ( rule__CheckboxChoice__ChoiceAssignment_0 ) ) ;
    public final void rule__CheckboxChoice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1072:1: ( ( ( rule__CheckboxChoice__ChoiceAssignment_0 ) ) )
            // InternalMyDsl.g:1073:1: ( ( rule__CheckboxChoice__ChoiceAssignment_0 ) )
            {
            // InternalMyDsl.g:1073:1: ( ( rule__CheckboxChoice__ChoiceAssignment_0 ) )
            // InternalMyDsl.g:1074:2: ( rule__CheckboxChoice__ChoiceAssignment_0 )
            {
             before(grammarAccess.getCheckboxChoiceAccess().getChoiceAssignment_0()); 
            // InternalMyDsl.g:1075:2: ( rule__CheckboxChoice__ChoiceAssignment_0 )
            // InternalMyDsl.g:1075:3: rule__CheckboxChoice__ChoiceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CheckboxChoice__ChoiceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCheckboxChoiceAccess().getChoiceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckboxChoice__Group__0__Impl"


    // $ANTLR start "rule__CheckboxChoice__Group__1"
    // InternalMyDsl.g:1083:1: rule__CheckboxChoice__Group__1 : rule__CheckboxChoice__Group__1__Impl rule__CheckboxChoice__Group__2 ;
    public final void rule__CheckboxChoice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1087:1: ( rule__CheckboxChoice__Group__1__Impl rule__CheckboxChoice__Group__2 )
            // InternalMyDsl.g:1088:2: rule__CheckboxChoice__Group__1__Impl rule__CheckboxChoice__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__CheckboxChoice__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CheckboxChoice__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckboxChoice__Group__1"


    // $ANTLR start "rule__CheckboxChoice__Group__1__Impl"
    // InternalMyDsl.g:1095:1: rule__CheckboxChoice__Group__1__Impl : ( ( '=x' )? ) ;
    public final void rule__CheckboxChoice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1099:1: ( ( ( '=x' )? ) )
            // InternalMyDsl.g:1100:1: ( ( '=x' )? )
            {
            // InternalMyDsl.g:1100:1: ( ( '=x' )? )
            // InternalMyDsl.g:1101:2: ( '=x' )?
            {
             before(grammarAccess.getCheckboxChoiceAccess().getXKeyword_1()); 
            // InternalMyDsl.g:1102:2: ( '=x' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1102:3: '=x'
                    {
                    match(input,18,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getCheckboxChoiceAccess().getXKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckboxChoice__Group__1__Impl"


    // $ANTLR start "rule__CheckboxChoice__Group__2"
    // InternalMyDsl.g:1110:1: rule__CheckboxChoice__Group__2 : rule__CheckboxChoice__Group__2__Impl ;
    public final void rule__CheckboxChoice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1114:1: ( rule__CheckboxChoice__Group__2__Impl )
            // InternalMyDsl.g:1115:2: rule__CheckboxChoice__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CheckboxChoice__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckboxChoice__Group__2"


    // $ANTLR start "rule__CheckboxChoice__Group__2__Impl"
    // InternalMyDsl.g:1121:1: rule__CheckboxChoice__Group__2__Impl : ( ( ',' )? ) ;
    public final void rule__CheckboxChoice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1125:1: ( ( ( ',' )? ) )
            // InternalMyDsl.g:1126:1: ( ( ',' )? )
            {
            // InternalMyDsl.g:1126:1: ( ( ',' )? )
            // InternalMyDsl.g:1127:2: ( ',' )?
            {
             before(grammarAccess.getCheckboxChoiceAccess().getCommaKeyword_2()); 
            // InternalMyDsl.g:1128:2: ( ',' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1128:3: ','
                    {
                    match(input,19,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getCheckboxChoiceAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckboxChoice__Group__2__Impl"


    // $ANTLR start "rule__Textfield__Group__0"
    // InternalMyDsl.g:1137:1: rule__Textfield__Group__0 : rule__Textfield__Group__0__Impl rule__Textfield__Group__1 ;
    public final void rule__Textfield__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1141:1: ( rule__Textfield__Group__0__Impl rule__Textfield__Group__1 )
            // InternalMyDsl.g:1142:2: rule__Textfield__Group__0__Impl rule__Textfield__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Textfield__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Textfield__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Textfield__Group__0"


    // $ANTLR start "rule__Textfield__Group__0__Impl"
    // InternalMyDsl.g:1149:1: rule__Textfield__Group__0__Impl : ( 'textfield' ) ;
    public final void rule__Textfield__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1153:1: ( ( 'textfield' ) )
            // InternalMyDsl.g:1154:1: ( 'textfield' )
            {
            // InternalMyDsl.g:1154:1: ( 'textfield' )
            // InternalMyDsl.g:1155:2: 'textfield'
            {
             before(grammarAccess.getTextfieldAccess().getTextfieldKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTextfieldAccess().getTextfieldKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Textfield__Group__0__Impl"


    // $ANTLR start "rule__Textfield__Group__1"
    // InternalMyDsl.g:1164:1: rule__Textfield__Group__1 : rule__Textfield__Group__1__Impl rule__Textfield__Group__2 ;
    public final void rule__Textfield__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1168:1: ( rule__Textfield__Group__1__Impl rule__Textfield__Group__2 )
            // InternalMyDsl.g:1169:2: rule__Textfield__Group__1__Impl rule__Textfield__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Textfield__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Textfield__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Textfield__Group__1"


    // $ANTLR start "rule__Textfield__Group__1__Impl"
    // InternalMyDsl.g:1176:1: rule__Textfield__Group__1__Impl : ( ( rule__Textfield__NameAssignment_1 ) ) ;
    public final void rule__Textfield__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1180:1: ( ( ( rule__Textfield__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1181:1: ( ( rule__Textfield__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1181:1: ( ( rule__Textfield__NameAssignment_1 ) )
            // InternalMyDsl.g:1182:2: ( rule__Textfield__NameAssignment_1 )
            {
             before(grammarAccess.getTextfieldAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1183:2: ( rule__Textfield__NameAssignment_1 )
            // InternalMyDsl.g:1183:3: rule__Textfield__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Textfield__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTextfieldAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Textfield__Group__1__Impl"


    // $ANTLR start "rule__Textfield__Group__2"
    // InternalMyDsl.g:1191:1: rule__Textfield__Group__2 : rule__Textfield__Group__2__Impl rule__Textfield__Group__3 ;
    public final void rule__Textfield__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1195:1: ( rule__Textfield__Group__2__Impl rule__Textfield__Group__3 )
            // InternalMyDsl.g:1196:2: rule__Textfield__Group__2__Impl rule__Textfield__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Textfield__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Textfield__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Textfield__Group__2"


    // $ANTLR start "rule__Textfield__Group__2__Impl"
    // InternalMyDsl.g:1203:1: rule__Textfield__Group__2__Impl : ( ( rule__Textfield__SizeAssignment_2 )? ) ;
    public final void rule__Textfield__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1207:1: ( ( ( rule__Textfield__SizeAssignment_2 )? ) )
            // InternalMyDsl.g:1208:1: ( ( rule__Textfield__SizeAssignment_2 )? )
            {
            // InternalMyDsl.g:1208:1: ( ( rule__Textfield__SizeAssignment_2 )? )
            // InternalMyDsl.g:1209:2: ( rule__Textfield__SizeAssignment_2 )?
            {
             before(grammarAccess.getTextfieldAccess().getSizeAssignment_2()); 
            // InternalMyDsl.g:1210:2: ( rule__Textfield__SizeAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1210:3: rule__Textfield__SizeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Textfield__SizeAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextfieldAccess().getSizeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Textfield__Group__2__Impl"


    // $ANTLR start "rule__Textfield__Group__3"
    // InternalMyDsl.g:1218:1: rule__Textfield__Group__3 : rule__Textfield__Group__3__Impl ;
    public final void rule__Textfield__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1222:1: ( rule__Textfield__Group__3__Impl )
            // InternalMyDsl.g:1223:2: rule__Textfield__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Textfield__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Textfield__Group__3"


    // $ANTLR start "rule__Textfield__Group__3__Impl"
    // InternalMyDsl.g:1229:1: rule__Textfield__Group__3__Impl : ( ( rule__Textfield__TextAssignment_3 ) ) ;
    public final void rule__Textfield__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1233:1: ( ( ( rule__Textfield__TextAssignment_3 ) ) )
            // InternalMyDsl.g:1234:1: ( ( rule__Textfield__TextAssignment_3 ) )
            {
            // InternalMyDsl.g:1234:1: ( ( rule__Textfield__TextAssignment_3 ) )
            // InternalMyDsl.g:1235:2: ( rule__Textfield__TextAssignment_3 )
            {
             before(grammarAccess.getTextfieldAccess().getTextAssignment_3()); 
            // InternalMyDsl.g:1236:2: ( rule__Textfield__TextAssignment_3 )
            // InternalMyDsl.g:1236:3: rule__Textfield__TextAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Textfield__TextAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTextfieldAccess().getTextAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Textfield__Group__3__Impl"


    // $ANTLR start "rule__Label__Group__0"
    // InternalMyDsl.g:1245:1: rule__Label__Group__0 : rule__Label__Group__0__Impl rule__Label__Group__1 ;
    public final void rule__Label__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1249:1: ( rule__Label__Group__0__Impl rule__Label__Group__1 )
            // InternalMyDsl.g:1250:2: rule__Label__Group__0__Impl rule__Label__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Label__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Label__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__0"


    // $ANTLR start "rule__Label__Group__0__Impl"
    // InternalMyDsl.g:1257:1: rule__Label__Group__0__Impl : ( 'label' ) ;
    public final void rule__Label__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1261:1: ( ( 'label' ) )
            // InternalMyDsl.g:1262:1: ( 'label' )
            {
            // InternalMyDsl.g:1262:1: ( 'label' )
            // InternalMyDsl.g:1263:2: 'label'
            {
             before(grammarAccess.getLabelAccess().getLabelKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLabelAccess().getLabelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__0__Impl"


    // $ANTLR start "rule__Label__Group__1"
    // InternalMyDsl.g:1272:1: rule__Label__Group__1 : rule__Label__Group__1__Impl rule__Label__Group__2 ;
    public final void rule__Label__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1276:1: ( rule__Label__Group__1__Impl rule__Label__Group__2 )
            // InternalMyDsl.g:1277:2: rule__Label__Group__1__Impl rule__Label__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Label__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Label__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__1"


    // $ANTLR start "rule__Label__Group__1__Impl"
    // InternalMyDsl.g:1284:1: rule__Label__Group__1__Impl : ( ( rule__Label__NameAssignment_1 ) ) ;
    public final void rule__Label__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1288:1: ( ( ( rule__Label__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1289:1: ( ( rule__Label__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1289:1: ( ( rule__Label__NameAssignment_1 ) )
            // InternalMyDsl.g:1290:2: ( rule__Label__NameAssignment_1 )
            {
             before(grammarAccess.getLabelAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1291:2: ( rule__Label__NameAssignment_1 )
            // InternalMyDsl.g:1291:3: rule__Label__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Label__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__1__Impl"


    // $ANTLR start "rule__Label__Group__2"
    // InternalMyDsl.g:1299:1: rule__Label__Group__2 : rule__Label__Group__2__Impl rule__Label__Group__3 ;
    public final void rule__Label__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1303:1: ( rule__Label__Group__2__Impl rule__Label__Group__3 )
            // InternalMyDsl.g:1304:2: rule__Label__Group__2__Impl rule__Label__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Label__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Label__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__2"


    // $ANTLR start "rule__Label__Group__2__Impl"
    // InternalMyDsl.g:1311:1: rule__Label__Group__2__Impl : ( ( rule__Label__SizeAssignment_2 )? ) ;
    public final void rule__Label__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1315:1: ( ( ( rule__Label__SizeAssignment_2 )? ) )
            // InternalMyDsl.g:1316:1: ( ( rule__Label__SizeAssignment_2 )? )
            {
            // InternalMyDsl.g:1316:1: ( ( rule__Label__SizeAssignment_2 )? )
            // InternalMyDsl.g:1317:2: ( rule__Label__SizeAssignment_2 )?
            {
             before(grammarAccess.getLabelAccess().getSizeAssignment_2()); 
            // InternalMyDsl.g:1318:2: ( rule__Label__SizeAssignment_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1318:3: rule__Label__SizeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Label__SizeAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLabelAccess().getSizeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__2__Impl"


    // $ANTLR start "rule__Label__Group__3"
    // InternalMyDsl.g:1326:1: rule__Label__Group__3 : rule__Label__Group__3__Impl ;
    public final void rule__Label__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1330:1: ( rule__Label__Group__3__Impl )
            // InternalMyDsl.g:1331:2: rule__Label__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Label__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__3"


    // $ANTLR start "rule__Label__Group__3__Impl"
    // InternalMyDsl.g:1337:1: rule__Label__Group__3__Impl : ( ( rule__Label__TextAssignment_3 ) ) ;
    public final void rule__Label__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1341:1: ( ( ( rule__Label__TextAssignment_3 ) ) )
            // InternalMyDsl.g:1342:1: ( ( rule__Label__TextAssignment_3 ) )
            {
            // InternalMyDsl.g:1342:1: ( ( rule__Label__TextAssignment_3 ) )
            // InternalMyDsl.g:1343:2: ( rule__Label__TextAssignment_3 )
            {
             before(grammarAccess.getLabelAccess().getTextAssignment_3()); 
            // InternalMyDsl.g:1344:2: ( rule__Label__TextAssignment_3 )
            // InternalMyDsl.g:1344:3: rule__Label__TextAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Label__TextAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getTextAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__3__Impl"


    // $ANTLR start "rule__Button__Group__0"
    // InternalMyDsl.g:1353:1: rule__Button__Group__0 : rule__Button__Group__0__Impl rule__Button__Group__1 ;
    public final void rule__Button__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1357:1: ( rule__Button__Group__0__Impl rule__Button__Group__1 )
            // InternalMyDsl.g:1358:2: rule__Button__Group__0__Impl rule__Button__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Button__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__0"


    // $ANTLR start "rule__Button__Group__0__Impl"
    // InternalMyDsl.g:1365:1: rule__Button__Group__0__Impl : ( 'button' ) ;
    public final void rule__Button__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1369:1: ( ( 'button' ) )
            // InternalMyDsl.g:1370:1: ( 'button' )
            {
            // InternalMyDsl.g:1370:1: ( 'button' )
            // InternalMyDsl.g:1371:2: 'button'
            {
             before(grammarAccess.getButtonAccess().getButtonKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getButtonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__0__Impl"


    // $ANTLR start "rule__Button__Group__1"
    // InternalMyDsl.g:1380:1: rule__Button__Group__1 : rule__Button__Group__1__Impl rule__Button__Group__2 ;
    public final void rule__Button__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1384:1: ( rule__Button__Group__1__Impl rule__Button__Group__2 )
            // InternalMyDsl.g:1385:2: rule__Button__Group__1__Impl rule__Button__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Button__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__1"


    // $ANTLR start "rule__Button__Group__1__Impl"
    // InternalMyDsl.g:1392:1: rule__Button__Group__1__Impl : ( ( rule__Button__NameAssignment_1 ) ) ;
    public final void rule__Button__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1396:1: ( ( ( rule__Button__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1397:1: ( ( rule__Button__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1397:1: ( ( rule__Button__NameAssignment_1 ) )
            // InternalMyDsl.g:1398:2: ( rule__Button__NameAssignment_1 )
            {
             before(grammarAccess.getButtonAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1399:2: ( rule__Button__NameAssignment_1 )
            // InternalMyDsl.g:1399:3: rule__Button__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Button__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__1__Impl"


    // $ANTLR start "rule__Button__Group__2"
    // InternalMyDsl.g:1407:1: rule__Button__Group__2 : rule__Button__Group__2__Impl rule__Button__Group__3 ;
    public final void rule__Button__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1411:1: ( rule__Button__Group__2__Impl rule__Button__Group__3 )
            // InternalMyDsl.g:1412:2: rule__Button__Group__2__Impl rule__Button__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Button__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__2"


    // $ANTLR start "rule__Button__Group__2__Impl"
    // InternalMyDsl.g:1419:1: rule__Button__Group__2__Impl : ( ( rule__Button__SizeAssignment_2 )? ) ;
    public final void rule__Button__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1423:1: ( ( ( rule__Button__SizeAssignment_2 )? ) )
            // InternalMyDsl.g:1424:1: ( ( rule__Button__SizeAssignment_2 )? )
            {
            // InternalMyDsl.g:1424:1: ( ( rule__Button__SizeAssignment_2 )? )
            // InternalMyDsl.g:1425:2: ( rule__Button__SizeAssignment_2 )?
            {
             before(grammarAccess.getButtonAccess().getSizeAssignment_2()); 
            // InternalMyDsl.g:1426:2: ( rule__Button__SizeAssignment_2 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1426:3: rule__Button__SizeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Button__SizeAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getButtonAccess().getSizeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__2__Impl"


    // $ANTLR start "rule__Button__Group__3"
    // InternalMyDsl.g:1434:1: rule__Button__Group__3 : rule__Button__Group__3__Impl ;
    public final void rule__Button__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1438:1: ( rule__Button__Group__3__Impl )
            // InternalMyDsl.g:1439:2: rule__Button__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Button__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__3"


    // $ANTLR start "rule__Button__Group__3__Impl"
    // InternalMyDsl.g:1445:1: rule__Button__Group__3__Impl : ( ( rule__Button__TextAssignment_3 ) ) ;
    public final void rule__Button__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1449:1: ( ( ( rule__Button__TextAssignment_3 ) ) )
            // InternalMyDsl.g:1450:1: ( ( rule__Button__TextAssignment_3 ) )
            {
            // InternalMyDsl.g:1450:1: ( ( rule__Button__TextAssignment_3 ) )
            // InternalMyDsl.g:1451:2: ( rule__Button__TextAssignment_3 )
            {
             before(grammarAccess.getButtonAccess().getTextAssignment_3()); 
            // InternalMyDsl.g:1452:2: ( rule__Button__TextAssignment_3 )
            // InternalMyDsl.g:1452:3: rule__Button__TextAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Button__TextAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getTextAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__3__Impl"


    // $ANTLR start "rule__Checkbox__Group__0"
    // InternalMyDsl.g:1461:1: rule__Checkbox__Group__0 : rule__Checkbox__Group__0__Impl rule__Checkbox__Group__1 ;
    public final void rule__Checkbox__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1465:1: ( rule__Checkbox__Group__0__Impl rule__Checkbox__Group__1 )
            // InternalMyDsl.g:1466:2: rule__Checkbox__Group__0__Impl rule__Checkbox__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Checkbox__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Checkbox__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkbox__Group__0"


    // $ANTLR start "rule__Checkbox__Group__0__Impl"
    // InternalMyDsl.g:1473:1: rule__Checkbox__Group__0__Impl : ( 'checkbox' ) ;
    public final void rule__Checkbox__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1477:1: ( ( 'checkbox' ) )
            // InternalMyDsl.g:1478:1: ( 'checkbox' )
            {
            // InternalMyDsl.g:1478:1: ( 'checkbox' )
            // InternalMyDsl.g:1479:2: 'checkbox'
            {
             before(grammarAccess.getCheckboxAccess().getCheckboxKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCheckboxAccess().getCheckboxKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkbox__Group__0__Impl"


    // $ANTLR start "rule__Checkbox__Group__1"
    // InternalMyDsl.g:1488:1: rule__Checkbox__Group__1 : rule__Checkbox__Group__1__Impl rule__Checkbox__Group__2 ;
    public final void rule__Checkbox__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1492:1: ( rule__Checkbox__Group__1__Impl rule__Checkbox__Group__2 )
            // InternalMyDsl.g:1493:2: rule__Checkbox__Group__1__Impl rule__Checkbox__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Checkbox__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Checkbox__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkbox__Group__1"


    // $ANTLR start "rule__Checkbox__Group__1__Impl"
    // InternalMyDsl.g:1500:1: rule__Checkbox__Group__1__Impl : ( ( rule__Checkbox__NameAssignment_1 ) ) ;
    public final void rule__Checkbox__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1504:1: ( ( ( rule__Checkbox__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1505:1: ( ( rule__Checkbox__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1505:1: ( ( rule__Checkbox__NameAssignment_1 ) )
            // InternalMyDsl.g:1506:2: ( rule__Checkbox__NameAssignment_1 )
            {
             before(grammarAccess.getCheckboxAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1507:2: ( rule__Checkbox__NameAssignment_1 )
            // InternalMyDsl.g:1507:3: rule__Checkbox__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Checkbox__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCheckboxAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkbox__Group__1__Impl"


    // $ANTLR start "rule__Checkbox__Group__2"
    // InternalMyDsl.g:1515:1: rule__Checkbox__Group__2 : rule__Checkbox__Group__2__Impl rule__Checkbox__Group__3 ;
    public final void rule__Checkbox__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1519:1: ( rule__Checkbox__Group__2__Impl rule__Checkbox__Group__3 )
            // InternalMyDsl.g:1520:2: rule__Checkbox__Group__2__Impl rule__Checkbox__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Checkbox__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Checkbox__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkbox__Group__2"


    // $ANTLR start "rule__Checkbox__Group__2__Impl"
    // InternalMyDsl.g:1527:1: rule__Checkbox__Group__2__Impl : ( ( rule__Checkbox__SizeAssignment_2 )? ) ;
    public final void rule__Checkbox__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1531:1: ( ( ( rule__Checkbox__SizeAssignment_2 )? ) )
            // InternalMyDsl.g:1532:1: ( ( rule__Checkbox__SizeAssignment_2 )? )
            {
            // InternalMyDsl.g:1532:1: ( ( rule__Checkbox__SizeAssignment_2 )? )
            // InternalMyDsl.g:1533:2: ( rule__Checkbox__SizeAssignment_2 )?
            {
             before(grammarAccess.getCheckboxAccess().getSizeAssignment_2()); 
            // InternalMyDsl.g:1534:2: ( rule__Checkbox__SizeAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1534:3: rule__Checkbox__SizeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Checkbox__SizeAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCheckboxAccess().getSizeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkbox__Group__2__Impl"


    // $ANTLR start "rule__Checkbox__Group__3"
    // InternalMyDsl.g:1542:1: rule__Checkbox__Group__3 : rule__Checkbox__Group__3__Impl ;
    public final void rule__Checkbox__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1546:1: ( rule__Checkbox__Group__3__Impl )
            // InternalMyDsl.g:1547:2: rule__Checkbox__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Checkbox__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkbox__Group__3"


    // $ANTLR start "rule__Checkbox__Group__3__Impl"
    // InternalMyDsl.g:1553:1: rule__Checkbox__Group__3__Impl : ( ( rule__Checkbox__ChoiceAssignment_3 ) ) ;
    public final void rule__Checkbox__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1557:1: ( ( ( rule__Checkbox__ChoiceAssignment_3 ) ) )
            // InternalMyDsl.g:1558:1: ( ( rule__Checkbox__ChoiceAssignment_3 ) )
            {
            // InternalMyDsl.g:1558:1: ( ( rule__Checkbox__ChoiceAssignment_3 ) )
            // InternalMyDsl.g:1559:2: ( rule__Checkbox__ChoiceAssignment_3 )
            {
             before(grammarAccess.getCheckboxAccess().getChoiceAssignment_3()); 
            // InternalMyDsl.g:1560:2: ( rule__Checkbox__ChoiceAssignment_3 )
            // InternalMyDsl.g:1560:3: rule__Checkbox__ChoiceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Checkbox__ChoiceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCheckboxAccess().getChoiceAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkbox__Group__3__Impl"


    // $ANTLR start "rule__Domainmodel__ElementsAssignment"
    // InternalMyDsl.g:1569:1: rule__Domainmodel__ElementsAssignment : ( ruleType ) ;
    public final void rule__Domainmodel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1573:1: ( ( ruleType ) )
            // InternalMyDsl.g:1574:2: ( ruleType )
            {
            // InternalMyDsl.g:1574:2: ( ruleType )
            // InternalMyDsl.g:1575:3: ruleType
            {
             before(grammarAccess.getDomainmodelAccess().getElementsTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getDomainmodelAccess().getElementsTypeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domainmodel__ElementsAssignment"


    // $ANTLR start "rule__Frame__NameAssignment_1"
    // InternalMyDsl.g:1584:1: rule__Frame__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Frame__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1588:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1589:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1589:2: ( RULE_ID )
            // InternalMyDsl.g:1590:3: RULE_ID
            {
             before(grammarAccess.getFrameAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFrameAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__NameAssignment_1"


    // $ANTLR start "rule__Frame__SizeAssignment_3"
    // InternalMyDsl.g:1599:1: rule__Frame__SizeAssignment_3 : ( ruleSize ) ;
    public final void rule__Frame__SizeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1603:1: ( ( ruleSize ) )
            // InternalMyDsl.g:1604:2: ( ruleSize )
            {
            // InternalMyDsl.g:1604:2: ( ruleSize )
            // InternalMyDsl.g:1605:3: ruleSize
            {
             before(grammarAccess.getFrameAccess().getSizeSizeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSize();

            state._fsp--;

             after(grammarAccess.getFrameAccess().getSizeSizeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__SizeAssignment_3"


    // $ANTLR start "rule__Frame__GuielementsAssignment_4"
    // InternalMyDsl.g:1614:1: rule__Frame__GuielementsAssignment_4 : ( ruleGuiElement ) ;
    public final void rule__Frame__GuielementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1618:1: ( ( ruleGuiElement ) )
            // InternalMyDsl.g:1619:2: ( ruleGuiElement )
            {
            // InternalMyDsl.g:1619:2: ( ruleGuiElement )
            // InternalMyDsl.g:1620:3: ruleGuiElement
            {
             before(grammarAccess.getFrameAccess().getGuielementsGuiElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleGuiElement();

            state._fsp--;

             after(grammarAccess.getFrameAccess().getGuielementsGuiElementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__GuielementsAssignment_4"


    // $ANTLR start "rule__Container__ContainerNameAssignment_1"
    // InternalMyDsl.g:1629:1: rule__Container__ContainerNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Container__ContainerNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1633:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1634:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1634:2: ( RULE_ID )
            // InternalMyDsl.g:1635:3: RULE_ID
            {
             before(grammarAccess.getContainerAccess().getContainerNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getContainerNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__ContainerNameAssignment_1"


    // $ANTLR start "rule__Container__SizeAssignment_3"
    // InternalMyDsl.g:1644:1: rule__Container__SizeAssignment_3 : ( ruleSize ) ;
    public final void rule__Container__SizeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1648:1: ( ( ruleSize ) )
            // InternalMyDsl.g:1649:2: ( ruleSize )
            {
            // InternalMyDsl.g:1649:2: ( ruleSize )
            // InternalMyDsl.g:1650:3: ruleSize
            {
             before(grammarAccess.getContainerAccess().getSizeSizeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSize();

            state._fsp--;

             after(grammarAccess.getContainerAccess().getSizeSizeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__SizeAssignment_3"


    // $ANTLR start "rule__Container__LayoutAssignment_4"
    // InternalMyDsl.g:1659:1: rule__Container__LayoutAssignment_4 : ( ruleLayout ) ;
    public final void rule__Container__LayoutAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1663:1: ( ( ruleLayout ) )
            // InternalMyDsl.g:1664:2: ( ruleLayout )
            {
            // InternalMyDsl.g:1664:2: ( ruleLayout )
            // InternalMyDsl.g:1665:3: ruleLayout
            {
             before(grammarAccess.getContainerAccess().getLayoutLayoutParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleLayout();

            state._fsp--;

             after(grammarAccess.getContainerAccess().getLayoutLayoutParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__LayoutAssignment_4"


    // $ANTLR start "rule__Container__GuielementsAssignment_5"
    // InternalMyDsl.g:1674:1: rule__Container__GuielementsAssignment_5 : ( ruleGuiElement ) ;
    public final void rule__Container__GuielementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1678:1: ( ( ruleGuiElement ) )
            // InternalMyDsl.g:1679:2: ( ruleGuiElement )
            {
            // InternalMyDsl.g:1679:2: ( ruleGuiElement )
            // InternalMyDsl.g:1680:3: ruleGuiElement
            {
             before(grammarAccess.getContainerAccess().getGuielementsGuiElementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleGuiElement();

            state._fsp--;

             after(grammarAccess.getContainerAccess().getGuielementsGuiElementParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__GuielementsAssignment_5"


    // $ANTLR start "rule__ContainerReference__ReferenceNameAssignment_0"
    // InternalMyDsl.g:1689:1: rule__ContainerReference__ReferenceNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ContainerReference__ReferenceNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1693:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1694:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1694:2: ( RULE_ID )
            // InternalMyDsl.g:1695:3: RULE_ID
            {
             before(grammarAccess.getContainerReferenceAccess().getReferenceNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getContainerReferenceAccess().getReferenceNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainerReference__ReferenceNameAssignment_0"


    // $ANTLR start "rule__ContainerReference__NameAssignment_1"
    // InternalMyDsl.g:1704:1: rule__ContainerReference__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ContainerReference__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1708:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1709:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1709:2: ( RULE_ID )
            // InternalMyDsl.g:1710:3: RULE_ID
            {
             before(grammarAccess.getContainerReferenceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getContainerReferenceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainerReference__NameAssignment_1"


    // $ANTLR start "rule__Layout__LayoutAssignment_1"
    // InternalMyDsl.g:1719:1: rule__Layout__LayoutAssignment_1 : ( RULE_ID ) ;
    public final void rule__Layout__LayoutAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1723:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1724:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1724:2: ( RULE_ID )
            // InternalMyDsl.g:1725:3: RULE_ID
            {
             before(grammarAccess.getLayoutAccess().getLayoutIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLayoutAccess().getLayoutIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__LayoutAssignment_1"


    // $ANTLR start "rule__Size__WidthAssignment_0"
    // InternalMyDsl.g:1734:1: rule__Size__WidthAssignment_0 : ( RULE_INT ) ;
    public final void rule__Size__WidthAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1738:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1739:2: ( RULE_INT )
            {
            // InternalMyDsl.g:1739:2: ( RULE_INT )
            // InternalMyDsl.g:1740:3: RULE_INT
            {
             before(grammarAccess.getSizeAccess().getWidthINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSizeAccess().getWidthINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__WidthAssignment_0"


    // $ANTLR start "rule__Size__HeightAssignment_2"
    // InternalMyDsl.g:1749:1: rule__Size__HeightAssignment_2 : ( RULE_INT ) ;
    public final void rule__Size__HeightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1753:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1754:2: ( RULE_INT )
            {
            // InternalMyDsl.g:1754:2: ( RULE_INT )
            // InternalMyDsl.g:1755:3: RULE_INT
            {
             before(grammarAccess.getSizeAccess().getHeightINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSizeAccess().getHeightINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__HeightAssignment_2"


    // $ANTLR start "rule__Text__TextAssignment_1"
    // InternalMyDsl.g:1764:1: rule__Text__TextAssignment_1 : ( RULE_ID ) ;
    public final void rule__Text__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1768:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1769:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1769:2: ( RULE_ID )
            // InternalMyDsl.g:1770:3: RULE_ID
            {
             before(grammarAccess.getTextAccess().getTextIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getTextIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__TextAssignment_1"


    // $ANTLR start "rule__CheckboxChoice__ChoiceAssignment_0"
    // InternalMyDsl.g:1779:1: rule__CheckboxChoice__ChoiceAssignment_0 : ( RULE_ID ) ;
    public final void rule__CheckboxChoice__ChoiceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1783:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1784:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1784:2: ( RULE_ID )
            // InternalMyDsl.g:1785:3: RULE_ID
            {
             before(grammarAccess.getCheckboxChoiceAccess().getChoiceIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheckboxChoiceAccess().getChoiceIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckboxChoice__ChoiceAssignment_0"


    // $ANTLR start "rule__Textfield__NameAssignment_1"
    // InternalMyDsl.g:1794:1: rule__Textfield__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Textfield__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1798:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1799:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1799:2: ( RULE_ID )
            // InternalMyDsl.g:1800:3: RULE_ID
            {
             before(grammarAccess.getTextfieldAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTextfieldAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Textfield__NameAssignment_1"


    // $ANTLR start "rule__Textfield__SizeAssignment_2"
    // InternalMyDsl.g:1809:1: rule__Textfield__SizeAssignment_2 : ( ruleSize ) ;
    public final void rule__Textfield__SizeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1813:1: ( ( ruleSize ) )
            // InternalMyDsl.g:1814:2: ( ruleSize )
            {
            // InternalMyDsl.g:1814:2: ( ruleSize )
            // InternalMyDsl.g:1815:3: ruleSize
            {
             before(grammarAccess.getTextfieldAccess().getSizeSizeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSize();

            state._fsp--;

             after(grammarAccess.getTextfieldAccess().getSizeSizeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Textfield__SizeAssignment_2"


    // $ANTLR start "rule__Textfield__TextAssignment_3"
    // InternalMyDsl.g:1824:1: rule__Textfield__TextAssignment_3 : ( ruleText ) ;
    public final void rule__Textfield__TextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1828:1: ( ( ruleText ) )
            // InternalMyDsl.g:1829:2: ( ruleText )
            {
            // InternalMyDsl.g:1829:2: ( ruleText )
            // InternalMyDsl.g:1830:3: ruleText
            {
             before(grammarAccess.getTextfieldAccess().getTextTextParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getTextfieldAccess().getTextTextParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Textfield__TextAssignment_3"


    // $ANTLR start "rule__Label__NameAssignment_1"
    // InternalMyDsl.g:1839:1: rule__Label__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Label__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1843:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1844:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1844:2: ( RULE_ID )
            // InternalMyDsl.g:1845:3: RULE_ID
            {
             before(grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__NameAssignment_1"


    // $ANTLR start "rule__Label__SizeAssignment_2"
    // InternalMyDsl.g:1854:1: rule__Label__SizeAssignment_2 : ( ruleSize ) ;
    public final void rule__Label__SizeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1858:1: ( ( ruleSize ) )
            // InternalMyDsl.g:1859:2: ( ruleSize )
            {
            // InternalMyDsl.g:1859:2: ( ruleSize )
            // InternalMyDsl.g:1860:3: ruleSize
            {
             before(grammarAccess.getLabelAccess().getSizeSizeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSize();

            state._fsp--;

             after(grammarAccess.getLabelAccess().getSizeSizeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__SizeAssignment_2"


    // $ANTLR start "rule__Label__TextAssignment_3"
    // InternalMyDsl.g:1869:1: rule__Label__TextAssignment_3 : ( ruleText ) ;
    public final void rule__Label__TextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1873:1: ( ( ruleText ) )
            // InternalMyDsl.g:1874:2: ( ruleText )
            {
            // InternalMyDsl.g:1874:2: ( ruleText )
            // InternalMyDsl.g:1875:3: ruleText
            {
             before(grammarAccess.getLabelAccess().getTextTextParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getLabelAccess().getTextTextParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__TextAssignment_3"


    // $ANTLR start "rule__Button__NameAssignment_1"
    // InternalMyDsl.g:1884:1: rule__Button__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Button__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1888:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1889:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1889:2: ( RULE_ID )
            // InternalMyDsl.g:1890:3: RULE_ID
            {
             before(grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__NameAssignment_1"


    // $ANTLR start "rule__Button__SizeAssignment_2"
    // InternalMyDsl.g:1899:1: rule__Button__SizeAssignment_2 : ( ruleSize ) ;
    public final void rule__Button__SizeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1903:1: ( ( ruleSize ) )
            // InternalMyDsl.g:1904:2: ( ruleSize )
            {
            // InternalMyDsl.g:1904:2: ( ruleSize )
            // InternalMyDsl.g:1905:3: ruleSize
            {
             before(grammarAccess.getButtonAccess().getSizeSizeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSize();

            state._fsp--;

             after(grammarAccess.getButtonAccess().getSizeSizeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__SizeAssignment_2"


    // $ANTLR start "rule__Button__TextAssignment_3"
    // InternalMyDsl.g:1914:1: rule__Button__TextAssignment_3 : ( ruleText ) ;
    public final void rule__Button__TextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1918:1: ( ( ruleText ) )
            // InternalMyDsl.g:1919:2: ( ruleText )
            {
            // InternalMyDsl.g:1919:2: ( ruleText )
            // InternalMyDsl.g:1920:3: ruleText
            {
             before(grammarAccess.getButtonAccess().getTextTextParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getButtonAccess().getTextTextParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__TextAssignment_3"


    // $ANTLR start "rule__Checkbox__NameAssignment_1"
    // InternalMyDsl.g:1929:1: rule__Checkbox__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Checkbox__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1933:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1934:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1934:2: ( RULE_ID )
            // InternalMyDsl.g:1935:3: RULE_ID
            {
             before(grammarAccess.getCheckboxAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheckboxAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkbox__NameAssignment_1"


    // $ANTLR start "rule__Checkbox__SizeAssignment_2"
    // InternalMyDsl.g:1944:1: rule__Checkbox__SizeAssignment_2 : ( ruleSize ) ;
    public final void rule__Checkbox__SizeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1948:1: ( ( ruleSize ) )
            // InternalMyDsl.g:1949:2: ( ruleSize )
            {
            // InternalMyDsl.g:1949:2: ( ruleSize )
            // InternalMyDsl.g:1950:3: ruleSize
            {
             before(grammarAccess.getCheckboxAccess().getSizeSizeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSize();

            state._fsp--;

             after(grammarAccess.getCheckboxAccess().getSizeSizeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkbox__SizeAssignment_2"


    // $ANTLR start "rule__Checkbox__ChoiceAssignment_3"
    // InternalMyDsl.g:1959:1: rule__Checkbox__ChoiceAssignment_3 : ( ruleCheckboxChoice ) ;
    public final void rule__Checkbox__ChoiceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1963:1: ( ( ruleCheckboxChoice ) )
            // InternalMyDsl.g:1964:2: ( ruleCheckboxChoice )
            {
            // InternalMyDsl.g:1964:2: ( ruleCheckboxChoice )
            // InternalMyDsl.g:1965:3: ruleCheckboxChoice
            {
             before(grammarAccess.getCheckboxAccess().getChoiceCheckboxChoiceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCheckboxChoice();

            state._fsp--;

             after(grammarAccess.getCheckboxAccess().getChoiceCheckboxChoiceParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkbox__ChoiceAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000F02030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000F00012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000F0A030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000030L});

}