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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'X'", "'O'", "'main='", "'frame'", "'container'", "'horizontal'", "'{'", "'}'", "'vertical'", "'positional'", "'['", "']'", "'space'", "','", "'textfield'", "'label'", "'button'", "'checkbox'", "'radio'"
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
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
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
    // InternalMyDsl.g:62:1: ruleDomainmodel : ( ( rule__Domainmodel__Group__0 ) ) ;
    public final void ruleDomainmodel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Domainmodel__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Domainmodel__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Domainmodel__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Domainmodel__Group__0 )
            {
             before(grammarAccess.getDomainmodelAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Domainmodel__Group__0 )
            // InternalMyDsl.g:69:4: rule__Domainmodel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Domainmodel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDomainmodelAccess().getGroup()); 

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


    // $ANTLR start "entryRuleLayout"
    // InternalMyDsl.g:153:1: entryRuleLayout : ruleLayout EOF ;
    public final void entryRuleLayout() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleLayout EOF )
            // InternalMyDsl.g:155:1: ruleLayout EOF
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
    // InternalMyDsl.g:162:1: ruleLayout : ( ( rule__Layout__Alternatives ) ) ;
    public final void ruleLayout() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Layout__Alternatives ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Layout__Alternatives ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Layout__Alternatives ) )
            // InternalMyDsl.g:168:3: ( rule__Layout__Alternatives )
            {
             before(grammarAccess.getLayoutAccess().getAlternatives()); 
            // InternalMyDsl.g:169:3: ( rule__Layout__Alternatives )
            // InternalMyDsl.g:169:4: rule__Layout__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Layout__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLayoutAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleLayoutHorizontal"
    // InternalMyDsl.g:178:1: entryRuleLayoutHorizontal : ruleLayoutHorizontal EOF ;
    public final void entryRuleLayoutHorizontal() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleLayoutHorizontal EOF )
            // InternalMyDsl.g:180:1: ruleLayoutHorizontal EOF
            {
             before(grammarAccess.getLayoutHorizontalRule()); 
            pushFollow(FOLLOW_1);
            ruleLayoutHorizontal();

            state._fsp--;

             after(grammarAccess.getLayoutHorizontalRule()); 
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
    // $ANTLR end "entryRuleLayoutHorizontal"


    // $ANTLR start "ruleLayoutHorizontal"
    // InternalMyDsl.g:187:1: ruleLayoutHorizontal : ( ( rule__LayoutHorizontal__Group__0 ) ) ;
    public final void ruleLayoutHorizontal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__LayoutHorizontal__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__LayoutHorizontal__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__LayoutHorizontal__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__LayoutHorizontal__Group__0 )
            {
             before(grammarAccess.getLayoutHorizontalAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__LayoutHorizontal__Group__0 )
            // InternalMyDsl.g:194:4: rule__LayoutHorizontal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LayoutHorizontal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLayoutHorizontalAccess().getGroup()); 

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
    // $ANTLR end "ruleLayoutHorizontal"


    // $ANTLR start "entryRuleLayoutHorizontalEntry"
    // InternalMyDsl.g:203:1: entryRuleLayoutHorizontalEntry : ruleLayoutHorizontalEntry EOF ;
    public final void entryRuleLayoutHorizontalEntry() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleLayoutHorizontalEntry EOF )
            // InternalMyDsl.g:205:1: ruleLayoutHorizontalEntry EOF
            {
             before(grammarAccess.getLayoutHorizontalEntryRule()); 
            pushFollow(FOLLOW_1);
            ruleLayoutHorizontalEntry();

            state._fsp--;

             after(grammarAccess.getLayoutHorizontalEntryRule()); 
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
    // $ANTLR end "entryRuleLayoutHorizontalEntry"


    // $ANTLR start "ruleLayoutHorizontalEntry"
    // InternalMyDsl.g:212:1: ruleLayoutHorizontalEntry : ( ( rule__LayoutHorizontalEntry__Alternatives ) ) ;
    public final void ruleLayoutHorizontalEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__LayoutHorizontalEntry__Alternatives ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__LayoutHorizontalEntry__Alternatives ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__LayoutHorizontalEntry__Alternatives ) )
            // InternalMyDsl.g:218:3: ( rule__LayoutHorizontalEntry__Alternatives )
            {
             before(grammarAccess.getLayoutHorizontalEntryAccess().getAlternatives()); 
            // InternalMyDsl.g:219:3: ( rule__LayoutHorizontalEntry__Alternatives )
            // InternalMyDsl.g:219:4: rule__LayoutHorizontalEntry__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LayoutHorizontalEntry__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLayoutHorizontalEntryAccess().getAlternatives()); 

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
    // $ANTLR end "ruleLayoutHorizontalEntry"


    // $ANTLR start "entryRuleLayoutVertical"
    // InternalMyDsl.g:228:1: entryRuleLayoutVertical : ruleLayoutVertical EOF ;
    public final void entryRuleLayoutVertical() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleLayoutVertical EOF )
            // InternalMyDsl.g:230:1: ruleLayoutVertical EOF
            {
             before(grammarAccess.getLayoutVerticalRule()); 
            pushFollow(FOLLOW_1);
            ruleLayoutVertical();

            state._fsp--;

             after(grammarAccess.getLayoutVerticalRule()); 
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
    // $ANTLR end "entryRuleLayoutVertical"


    // $ANTLR start "ruleLayoutVertical"
    // InternalMyDsl.g:237:1: ruleLayoutVertical : ( ( rule__LayoutVertical__Group__0 ) ) ;
    public final void ruleLayoutVertical() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__LayoutVertical__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__LayoutVertical__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__LayoutVertical__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__LayoutVertical__Group__0 )
            {
             before(grammarAccess.getLayoutVerticalAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__LayoutVertical__Group__0 )
            // InternalMyDsl.g:244:4: rule__LayoutVertical__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LayoutVertical__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLayoutVerticalAccess().getGroup()); 

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
    // $ANTLR end "ruleLayoutVertical"


    // $ANTLR start "entryRuleLayoutVerticalEntry"
    // InternalMyDsl.g:253:1: entryRuleLayoutVerticalEntry : ruleLayoutVerticalEntry EOF ;
    public final void entryRuleLayoutVerticalEntry() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleLayoutVerticalEntry EOF )
            // InternalMyDsl.g:255:1: ruleLayoutVerticalEntry EOF
            {
             before(grammarAccess.getLayoutVerticalEntryRule()); 
            pushFollow(FOLLOW_1);
            ruleLayoutVerticalEntry();

            state._fsp--;

             after(grammarAccess.getLayoutVerticalEntryRule()); 
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
    // $ANTLR end "entryRuleLayoutVerticalEntry"


    // $ANTLR start "ruleLayoutVerticalEntry"
    // InternalMyDsl.g:262:1: ruleLayoutVerticalEntry : ( ( rule__LayoutVerticalEntry__Alternatives ) ) ;
    public final void ruleLayoutVerticalEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__LayoutVerticalEntry__Alternatives ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__LayoutVerticalEntry__Alternatives ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__LayoutVerticalEntry__Alternatives ) )
            // InternalMyDsl.g:268:3: ( rule__LayoutVerticalEntry__Alternatives )
            {
             before(grammarAccess.getLayoutVerticalEntryAccess().getAlternatives()); 
            // InternalMyDsl.g:269:3: ( rule__LayoutVerticalEntry__Alternatives )
            // InternalMyDsl.g:269:4: rule__LayoutVerticalEntry__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LayoutVerticalEntry__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLayoutVerticalEntryAccess().getAlternatives()); 

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
    // $ANTLR end "ruleLayoutVerticalEntry"


    // $ANTLR start "entryRuleLayoutPosition"
    // InternalMyDsl.g:278:1: entryRuleLayoutPosition : ruleLayoutPosition EOF ;
    public final void entryRuleLayoutPosition() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleLayoutPosition EOF )
            // InternalMyDsl.g:280:1: ruleLayoutPosition EOF
            {
             before(grammarAccess.getLayoutPositionRule()); 
            pushFollow(FOLLOW_1);
            ruleLayoutPosition();

            state._fsp--;

             after(grammarAccess.getLayoutPositionRule()); 
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
    // $ANTLR end "entryRuleLayoutPosition"


    // $ANTLR start "ruleLayoutPosition"
    // InternalMyDsl.g:287:1: ruleLayoutPosition : ( ( rule__LayoutPosition__Group__0 ) ) ;
    public final void ruleLayoutPosition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__LayoutPosition__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__LayoutPosition__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__LayoutPosition__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__LayoutPosition__Group__0 )
            {
             before(grammarAccess.getLayoutPositionAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__LayoutPosition__Group__0 )
            // InternalMyDsl.g:294:4: rule__LayoutPosition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LayoutPosition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLayoutPositionAccess().getGroup()); 

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
    // $ANTLR end "ruleLayoutPosition"


    // $ANTLR start "entryRuleLayoutPositionEntry"
    // InternalMyDsl.g:303:1: entryRuleLayoutPositionEntry : ruleLayoutPositionEntry EOF ;
    public final void entryRuleLayoutPositionEntry() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleLayoutPositionEntry EOF )
            // InternalMyDsl.g:305:1: ruleLayoutPositionEntry EOF
            {
             before(grammarAccess.getLayoutPositionEntryRule()); 
            pushFollow(FOLLOW_1);
            ruleLayoutPositionEntry();

            state._fsp--;

             after(grammarAccess.getLayoutPositionEntryRule()); 
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
    // $ANTLR end "entryRuleLayoutPositionEntry"


    // $ANTLR start "ruleLayoutPositionEntry"
    // InternalMyDsl.g:312:1: ruleLayoutPositionEntry : ( ( rule__LayoutPositionEntry__Group__0 ) ) ;
    public final void ruleLayoutPositionEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__LayoutPositionEntry__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__LayoutPositionEntry__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__LayoutPositionEntry__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__LayoutPositionEntry__Group__0 )
            {
             before(grammarAccess.getLayoutPositionEntryAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__LayoutPositionEntry__Group__0 )
            // InternalMyDsl.g:319:4: rule__LayoutPositionEntry__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LayoutPositionEntry__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLayoutPositionEntryAccess().getGroup()); 

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
    // $ANTLR end "ruleLayoutPositionEntry"


    // $ANTLR start "entryRuleSpace"
    // InternalMyDsl.g:328:1: entryRuleSpace : ruleSpace EOF ;
    public final void entryRuleSpace() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleSpace EOF )
            // InternalMyDsl.g:330:1: ruleSpace EOF
            {
             before(grammarAccess.getSpaceRule()); 
            pushFollow(FOLLOW_1);
            ruleSpace();

            state._fsp--;

             after(grammarAccess.getSpaceRule()); 
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
    // $ANTLR end "entryRuleSpace"


    // $ANTLR start "ruleSpace"
    // InternalMyDsl.g:337:1: ruleSpace : ( ( rule__Space__Group__0 ) ) ;
    public final void ruleSpace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__Space__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__Space__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__Space__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__Space__Group__0 )
            {
             before(grammarAccess.getSpaceAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__Space__Group__0 )
            // InternalMyDsl.g:344:4: rule__Space__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Space__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpaceAccess().getGroup()); 

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
    // $ANTLR end "ruleSpace"


    // $ANTLR start "entryRulePositionValue"
    // InternalMyDsl.g:353:1: entryRulePositionValue : rulePositionValue EOF ;
    public final void entryRulePositionValue() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( rulePositionValue EOF )
            // InternalMyDsl.g:355:1: rulePositionValue EOF
            {
             before(grammarAccess.getPositionValueRule()); 
            pushFollow(FOLLOW_1);
            rulePositionValue();

            state._fsp--;

             after(grammarAccess.getPositionValueRule()); 
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
    // $ANTLR end "entryRulePositionValue"


    // $ANTLR start "rulePositionValue"
    // InternalMyDsl.g:362:1: rulePositionValue : ( ( rule__PositionValue__Group__0 ) ) ;
    public final void rulePositionValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__PositionValue__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__PositionValue__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__PositionValue__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__PositionValue__Group__0 )
            {
             before(grammarAccess.getPositionValueAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__PositionValue__Group__0 )
            // InternalMyDsl.g:369:4: rule__PositionValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PositionValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPositionValueAccess().getGroup()); 

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
    // $ANTLR end "rulePositionValue"


    // $ANTLR start "entryRuleSize"
    // InternalMyDsl.g:378:1: entryRuleSize : ruleSize EOF ;
    public final void entryRuleSize() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleSize EOF )
            // InternalMyDsl.g:380:1: ruleSize EOF
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
    // InternalMyDsl.g:387:1: ruleSize : ( ( rule__Size__Group__0 ) ) ;
    public final void ruleSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__Size__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__Size__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__Size__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__Size__Group__0 )
            {
             before(grammarAccess.getSizeAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__Size__Group__0 )
            // InternalMyDsl.g:394:4: rule__Size__Group__0
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


    // $ANTLR start "entryRuleGuiElement"
    // InternalMyDsl.g:403:1: entryRuleGuiElement : ruleGuiElement EOF ;
    public final void entryRuleGuiElement() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleGuiElement EOF )
            // InternalMyDsl.g:405:1: ruleGuiElement EOF
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
    // InternalMyDsl.g:412:1: ruleGuiElement : ( ( rule__GuiElement__Alternatives ) ) ;
    public final void ruleGuiElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__GuiElement__Alternatives ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__GuiElement__Alternatives ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__GuiElement__Alternatives ) )
            // InternalMyDsl.g:418:3: ( rule__GuiElement__Alternatives )
            {
             before(grammarAccess.getGuiElementAccess().getAlternatives()); 
            // InternalMyDsl.g:419:3: ( rule__GuiElement__Alternatives )
            // InternalMyDsl.g:419:4: rule__GuiElement__Alternatives
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


    // $ANTLR start "entryRuleContainerReference"
    // InternalMyDsl.g:428:1: entryRuleContainerReference : ruleContainerReference EOF ;
    public final void entryRuleContainerReference() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleContainerReference EOF )
            // InternalMyDsl.g:430:1: ruleContainerReference EOF
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
    // InternalMyDsl.g:437:1: ruleContainerReference : ( ( rule__ContainerReference__Group__0 ) ) ;
    public final void ruleContainerReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__ContainerReference__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__ContainerReference__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__ContainerReference__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__ContainerReference__Group__0 )
            {
             before(grammarAccess.getContainerReferenceAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__ContainerReference__Group__0 )
            // InternalMyDsl.g:444:4: rule__ContainerReference__Group__0
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


    // $ANTLR start "entryRuleText"
    // InternalMyDsl.g:453:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleText EOF )
            // InternalMyDsl.g:455:1: ruleText EOF
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
    // InternalMyDsl.g:462:1: ruleText : ( ( rule__Text__TextAssignment ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__Text__TextAssignment ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__Text__TextAssignment ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__Text__TextAssignment ) )
            // InternalMyDsl.g:468:3: ( rule__Text__TextAssignment )
            {
             before(grammarAccess.getTextAccess().getTextAssignment()); 
            // InternalMyDsl.g:469:3: ( rule__Text__TextAssignment )
            // InternalMyDsl.g:469:4: rule__Text__TextAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Text__TextAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getTextAssignment()); 

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


    // $ANTLR start "entryRuleTextfield"
    // InternalMyDsl.g:478:1: entryRuleTextfield : ruleTextfield EOF ;
    public final void entryRuleTextfield() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleTextfield EOF )
            // InternalMyDsl.g:480:1: ruleTextfield EOF
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
    // InternalMyDsl.g:487:1: ruleTextfield : ( ( rule__Textfield__Group__0 ) ) ;
    public final void ruleTextfield() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__Textfield__Group__0 ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__Textfield__Group__0 ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__Textfield__Group__0 ) )
            // InternalMyDsl.g:493:3: ( rule__Textfield__Group__0 )
            {
             before(grammarAccess.getTextfieldAccess().getGroup()); 
            // InternalMyDsl.g:494:3: ( rule__Textfield__Group__0 )
            // InternalMyDsl.g:494:4: rule__Textfield__Group__0
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
    // InternalMyDsl.g:503:1: entryRuleLabel : ruleLabel EOF ;
    public final void entryRuleLabel() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleLabel EOF )
            // InternalMyDsl.g:505:1: ruleLabel EOF
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
    // InternalMyDsl.g:512:1: ruleLabel : ( ( rule__Label__Group__0 ) ) ;
    public final void ruleLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__Label__Group__0 ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__Label__Group__0 ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__Label__Group__0 ) )
            // InternalMyDsl.g:518:3: ( rule__Label__Group__0 )
            {
             before(grammarAccess.getLabelAccess().getGroup()); 
            // InternalMyDsl.g:519:3: ( rule__Label__Group__0 )
            // InternalMyDsl.g:519:4: rule__Label__Group__0
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
    // InternalMyDsl.g:528:1: entryRuleButton : ruleButton EOF ;
    public final void entryRuleButton() throws RecognitionException {
        try {
            // InternalMyDsl.g:529:1: ( ruleButton EOF )
            // InternalMyDsl.g:530:1: ruleButton EOF
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
    // InternalMyDsl.g:537:1: ruleButton : ( ( rule__Button__Group__0 ) ) ;
    public final void ruleButton() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:2: ( ( ( rule__Button__Group__0 ) ) )
            // InternalMyDsl.g:542:2: ( ( rule__Button__Group__0 ) )
            {
            // InternalMyDsl.g:542:2: ( ( rule__Button__Group__0 ) )
            // InternalMyDsl.g:543:3: ( rule__Button__Group__0 )
            {
             before(grammarAccess.getButtonAccess().getGroup()); 
            // InternalMyDsl.g:544:3: ( rule__Button__Group__0 )
            // InternalMyDsl.g:544:4: rule__Button__Group__0
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
    // InternalMyDsl.g:553:1: entryRuleCheckbox : ruleCheckbox EOF ;
    public final void entryRuleCheckbox() throws RecognitionException {
        try {
            // InternalMyDsl.g:554:1: ( ruleCheckbox EOF )
            // InternalMyDsl.g:555:1: ruleCheckbox EOF
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
    // InternalMyDsl.g:562:1: ruleCheckbox : ( ( rule__Checkbox__Group__0 ) ) ;
    public final void ruleCheckbox() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:2: ( ( ( rule__Checkbox__Group__0 ) ) )
            // InternalMyDsl.g:567:2: ( ( rule__Checkbox__Group__0 ) )
            {
            // InternalMyDsl.g:567:2: ( ( rule__Checkbox__Group__0 ) )
            // InternalMyDsl.g:568:3: ( rule__Checkbox__Group__0 )
            {
             before(grammarAccess.getCheckboxAccess().getGroup()); 
            // InternalMyDsl.g:569:3: ( rule__Checkbox__Group__0 )
            // InternalMyDsl.g:569:4: rule__Checkbox__Group__0
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


    // $ANTLR start "entryRuleRadiobutton"
    // InternalMyDsl.g:578:1: entryRuleRadiobutton : ruleRadiobutton EOF ;
    public final void entryRuleRadiobutton() throws RecognitionException {
        try {
            // InternalMyDsl.g:579:1: ( ruleRadiobutton EOF )
            // InternalMyDsl.g:580:1: ruleRadiobutton EOF
            {
             before(grammarAccess.getRadiobuttonRule()); 
            pushFollow(FOLLOW_1);
            ruleRadiobutton();

            state._fsp--;

             after(grammarAccess.getRadiobuttonRule()); 
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
    // $ANTLR end "entryRuleRadiobutton"


    // $ANTLR start "ruleRadiobutton"
    // InternalMyDsl.g:587:1: ruleRadiobutton : ( ( rule__Radiobutton__Group__0 ) ) ;
    public final void ruleRadiobutton() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:2: ( ( ( rule__Radiobutton__Group__0 ) ) )
            // InternalMyDsl.g:592:2: ( ( rule__Radiobutton__Group__0 ) )
            {
            // InternalMyDsl.g:592:2: ( ( rule__Radiobutton__Group__0 ) )
            // InternalMyDsl.g:593:3: ( rule__Radiobutton__Group__0 )
            {
             before(grammarAccess.getRadiobuttonAccess().getGroup()); 
            // InternalMyDsl.g:594:3: ( rule__Radiobutton__Group__0 )
            // InternalMyDsl.g:594:4: rule__Radiobutton__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Radiobutton__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRadiobuttonAccess().getGroup()); 

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
    // $ANTLR end "ruleRadiobutton"


    // $ANTLR start "entryRuleCHECKED"
    // InternalMyDsl.g:603:1: entryRuleCHECKED : ruleCHECKED EOF ;
    public final void entryRuleCHECKED() throws RecognitionException {
        try {
            // InternalMyDsl.g:604:1: ( ruleCHECKED EOF )
            // InternalMyDsl.g:605:1: ruleCHECKED EOF
            {
             before(grammarAccess.getCHECKEDRule()); 
            pushFollow(FOLLOW_1);
            ruleCHECKED();

            state._fsp--;

             after(grammarAccess.getCHECKEDRule()); 
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
    // $ANTLR end "entryRuleCHECKED"


    // $ANTLR start "ruleCHECKED"
    // InternalMyDsl.g:612:1: ruleCHECKED : ( ( rule__CHECKED__Alternatives ) ) ;
    public final void ruleCHECKED() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:2: ( ( ( rule__CHECKED__Alternatives ) ) )
            // InternalMyDsl.g:617:2: ( ( rule__CHECKED__Alternatives ) )
            {
            // InternalMyDsl.g:617:2: ( ( rule__CHECKED__Alternatives ) )
            // InternalMyDsl.g:618:3: ( rule__CHECKED__Alternatives )
            {
             before(grammarAccess.getCHECKEDAccess().getAlternatives()); 
            // InternalMyDsl.g:619:3: ( rule__CHECKED__Alternatives )
            // InternalMyDsl.g:619:4: rule__CHECKED__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CHECKED__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCHECKEDAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCHECKED"


    // $ANTLR start "entryRuleCHECKED_YES"
    // InternalMyDsl.g:628:1: entryRuleCHECKED_YES : ruleCHECKED_YES EOF ;
    public final void entryRuleCHECKED_YES() throws RecognitionException {
        try {
            // InternalMyDsl.g:629:1: ( ruleCHECKED_YES EOF )
            // InternalMyDsl.g:630:1: ruleCHECKED_YES EOF
            {
             before(grammarAccess.getCHECKED_YESRule()); 
            pushFollow(FOLLOW_1);
            ruleCHECKED_YES();

            state._fsp--;

             after(grammarAccess.getCHECKED_YESRule()); 
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
    // $ANTLR end "entryRuleCHECKED_YES"


    // $ANTLR start "ruleCHECKED_YES"
    // InternalMyDsl.g:637:1: ruleCHECKED_YES : ( 'X' ) ;
    public final void ruleCHECKED_YES() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:641:2: ( ( 'X' ) )
            // InternalMyDsl.g:642:2: ( 'X' )
            {
            // InternalMyDsl.g:642:2: ( 'X' )
            // InternalMyDsl.g:643:3: 'X'
            {
             before(grammarAccess.getCHECKED_YESAccess().getXKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getCHECKED_YESAccess().getXKeyword()); 

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
    // $ANTLR end "ruleCHECKED_YES"


    // $ANTLR start "entryRuleCHECKED_NO"
    // InternalMyDsl.g:653:1: entryRuleCHECKED_NO : ruleCHECKED_NO EOF ;
    public final void entryRuleCHECKED_NO() throws RecognitionException {
        try {
            // InternalMyDsl.g:654:1: ( ruleCHECKED_NO EOF )
            // InternalMyDsl.g:655:1: ruleCHECKED_NO EOF
            {
             before(grammarAccess.getCHECKED_NORule()); 
            pushFollow(FOLLOW_1);
            ruleCHECKED_NO();

            state._fsp--;

             after(grammarAccess.getCHECKED_NORule()); 
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
    // $ANTLR end "entryRuleCHECKED_NO"


    // $ANTLR start "ruleCHECKED_NO"
    // InternalMyDsl.g:662:1: ruleCHECKED_NO : ( 'O' ) ;
    public final void ruleCHECKED_NO() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:666:2: ( ( 'O' ) )
            // InternalMyDsl.g:667:2: ( 'O' )
            {
            // InternalMyDsl.g:667:2: ( 'O' )
            // InternalMyDsl.g:668:3: 'O'
            {
             before(grammarAccess.getCHECKED_NOAccess().getOKeyword()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCHECKED_NOAccess().getOKeyword()); 

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
    // $ANTLR end "ruleCHECKED_NO"


    // $ANTLR start "entryRuleNAME"
    // InternalMyDsl.g:678:1: entryRuleNAME : ruleNAME EOF ;
    public final void entryRuleNAME() throws RecognitionException {
        try {
            // InternalMyDsl.g:679:1: ( ruleNAME EOF )
            // InternalMyDsl.g:680:1: ruleNAME EOF
            {
             before(grammarAccess.getNAMERule()); 
            pushFollow(FOLLOW_1);
            ruleNAME();

            state._fsp--;

             after(grammarAccess.getNAMERule()); 
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
    // $ANTLR end "entryRuleNAME"


    // $ANTLR start "ruleNAME"
    // InternalMyDsl.g:687:1: ruleNAME : ( RULE_ID ) ;
    public final void ruleNAME() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:691:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:692:2: ( RULE_ID )
            {
            // InternalMyDsl.g:692:2: ( RULE_ID )
            // InternalMyDsl.g:693:3: RULE_ID
            {
             before(grammarAccess.getNAMEAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNAMEAccess().getIDTerminalRuleCall()); 

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
    // $ANTLR end "ruleNAME"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalMyDsl.g:702:1: rule__Type__Alternatives : ( ( ruleFrame ) | ( ruleContainer ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:706:1: ( ( ruleFrame ) | ( ruleContainer ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            else if ( (LA1_0==15) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:707:2: ( ruleFrame )
                    {
                    // InternalMyDsl.g:707:2: ( ruleFrame )
                    // InternalMyDsl.g:708:3: ruleFrame
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
                    // InternalMyDsl.g:713:2: ( ruleContainer )
                    {
                    // InternalMyDsl.g:713:2: ( ruleContainer )
                    // InternalMyDsl.g:714:3: ruleContainer
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


    // $ANTLR start "rule__Layout__Alternatives"
    // InternalMyDsl.g:723:1: rule__Layout__Alternatives : ( ( ruleLayoutHorizontal ) | ( ruleLayoutVertical ) | ( ruleLayoutPosition ) );
    public final void rule__Layout__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:727:1: ( ( ruleLayoutHorizontal ) | ( ruleLayoutVertical ) | ( ruleLayoutPosition ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case 20:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:728:2: ( ruleLayoutHorizontal )
                    {
                    // InternalMyDsl.g:728:2: ( ruleLayoutHorizontal )
                    // InternalMyDsl.g:729:3: ruleLayoutHorizontal
                    {
                     before(grammarAccess.getLayoutAccess().getLayoutHorizontalParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLayoutHorizontal();

                    state._fsp--;

                     after(grammarAccess.getLayoutAccess().getLayoutHorizontalParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:734:2: ( ruleLayoutVertical )
                    {
                    // InternalMyDsl.g:734:2: ( ruleLayoutVertical )
                    // InternalMyDsl.g:735:3: ruleLayoutVertical
                    {
                     before(grammarAccess.getLayoutAccess().getLayoutVerticalParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLayoutVertical();

                    state._fsp--;

                     after(grammarAccess.getLayoutAccess().getLayoutVerticalParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:740:2: ( ruleLayoutPosition )
                    {
                    // InternalMyDsl.g:740:2: ( ruleLayoutPosition )
                    // InternalMyDsl.g:741:3: ruleLayoutPosition
                    {
                     before(grammarAccess.getLayoutAccess().getLayoutPositionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLayoutPosition();

                    state._fsp--;

                     after(grammarAccess.getLayoutAccess().getLayoutPositionParserRuleCall_2()); 

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
    // $ANTLR end "rule__Layout__Alternatives"


    // $ANTLR start "rule__LayoutHorizontalEntry__Alternatives"
    // InternalMyDsl.g:750:1: rule__LayoutHorizontalEntry__Alternatives : ( ( ( rule__LayoutHorizontalEntry__SpaceAssignment_0 ) ) | ( ( rule__LayoutHorizontalEntry__GuielementAssignment_1 ) ) );
    public final void rule__LayoutHorizontalEntry__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:754:1: ( ( ( rule__LayoutHorizontalEntry__SpaceAssignment_0 ) ) | ( ( rule__LayoutHorizontalEntry__GuielementAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==23) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID||LA3_0==16||(LA3_0>=19 && LA3_0<=20)||(LA3_0>=25 && LA3_0<=29)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:755:2: ( ( rule__LayoutHorizontalEntry__SpaceAssignment_0 ) )
                    {
                    // InternalMyDsl.g:755:2: ( ( rule__LayoutHorizontalEntry__SpaceAssignment_0 ) )
                    // InternalMyDsl.g:756:3: ( rule__LayoutHorizontalEntry__SpaceAssignment_0 )
                    {
                     before(grammarAccess.getLayoutHorizontalEntryAccess().getSpaceAssignment_0()); 
                    // InternalMyDsl.g:757:3: ( rule__LayoutHorizontalEntry__SpaceAssignment_0 )
                    // InternalMyDsl.g:757:4: rule__LayoutHorizontalEntry__SpaceAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LayoutHorizontalEntry__SpaceAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLayoutHorizontalEntryAccess().getSpaceAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:761:2: ( ( rule__LayoutHorizontalEntry__GuielementAssignment_1 ) )
                    {
                    // InternalMyDsl.g:761:2: ( ( rule__LayoutHorizontalEntry__GuielementAssignment_1 ) )
                    // InternalMyDsl.g:762:3: ( rule__LayoutHorizontalEntry__GuielementAssignment_1 )
                    {
                     before(grammarAccess.getLayoutHorizontalEntryAccess().getGuielementAssignment_1()); 
                    // InternalMyDsl.g:763:3: ( rule__LayoutHorizontalEntry__GuielementAssignment_1 )
                    // InternalMyDsl.g:763:4: rule__LayoutHorizontalEntry__GuielementAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__LayoutHorizontalEntry__GuielementAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getLayoutHorizontalEntryAccess().getGuielementAssignment_1()); 

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
    // $ANTLR end "rule__LayoutHorizontalEntry__Alternatives"


    // $ANTLR start "rule__LayoutVerticalEntry__Alternatives"
    // InternalMyDsl.g:771:1: rule__LayoutVerticalEntry__Alternatives : ( ( ( rule__LayoutVerticalEntry__SpaceAssignment_0 ) ) | ( ( rule__LayoutVerticalEntry__GuielementAssignment_1 ) ) );
    public final void rule__LayoutVerticalEntry__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:775:1: ( ( ( rule__LayoutVerticalEntry__SpaceAssignment_0 ) ) | ( ( rule__LayoutVerticalEntry__GuielementAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID||LA4_0==16||(LA4_0>=19 && LA4_0<=20)||(LA4_0>=25 && LA4_0<=29)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:776:2: ( ( rule__LayoutVerticalEntry__SpaceAssignment_0 ) )
                    {
                    // InternalMyDsl.g:776:2: ( ( rule__LayoutVerticalEntry__SpaceAssignment_0 ) )
                    // InternalMyDsl.g:777:3: ( rule__LayoutVerticalEntry__SpaceAssignment_0 )
                    {
                     before(grammarAccess.getLayoutVerticalEntryAccess().getSpaceAssignment_0()); 
                    // InternalMyDsl.g:778:3: ( rule__LayoutVerticalEntry__SpaceAssignment_0 )
                    // InternalMyDsl.g:778:4: rule__LayoutVerticalEntry__SpaceAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LayoutVerticalEntry__SpaceAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLayoutVerticalEntryAccess().getSpaceAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:782:2: ( ( rule__LayoutVerticalEntry__GuielementAssignment_1 ) )
                    {
                    // InternalMyDsl.g:782:2: ( ( rule__LayoutVerticalEntry__GuielementAssignment_1 ) )
                    // InternalMyDsl.g:783:3: ( rule__LayoutVerticalEntry__GuielementAssignment_1 )
                    {
                     before(grammarAccess.getLayoutVerticalEntryAccess().getGuielementAssignment_1()); 
                    // InternalMyDsl.g:784:3: ( rule__LayoutVerticalEntry__GuielementAssignment_1 )
                    // InternalMyDsl.g:784:4: rule__LayoutVerticalEntry__GuielementAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__LayoutVerticalEntry__GuielementAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getLayoutVerticalEntryAccess().getGuielementAssignment_1()); 

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
    // $ANTLR end "rule__LayoutVerticalEntry__Alternatives"


    // $ANTLR start "rule__GuiElement__Alternatives"
    // InternalMyDsl.g:792:1: rule__GuiElement__Alternatives : ( ( ruleContainerReference ) | ( ruleLayout ) | ( ruleTextfield ) | ( ruleLabel ) | ( ruleButton ) | ( ruleCheckbox ) | ( ruleRadiobutton ) );
    public final void rule__GuiElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:796:1: ( ( ruleContainerReference ) | ( ruleLayout ) | ( ruleTextfield ) | ( ruleLabel ) | ( ruleButton ) | ( ruleCheckbox ) | ( ruleRadiobutton ) )
            int alt5=7;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt5=1;
                }
                break;
            case 16:
            case 19:
            case 20:
                {
                alt5=2;
                }
                break;
            case 25:
                {
                alt5=3;
                }
                break;
            case 26:
                {
                alt5=4;
                }
                break;
            case 27:
                {
                alt5=5;
                }
                break;
            case 28:
                {
                alt5=6;
                }
                break;
            case 29:
                {
                alt5=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:797:2: ( ruleContainerReference )
                    {
                    // InternalMyDsl.g:797:2: ( ruleContainerReference )
                    // InternalMyDsl.g:798:3: ruleContainerReference
                    {
                     before(grammarAccess.getGuiElementAccess().getContainerReferenceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleContainerReference();

                    state._fsp--;

                     after(grammarAccess.getGuiElementAccess().getContainerReferenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:803:2: ( ruleLayout )
                    {
                    // InternalMyDsl.g:803:2: ( ruleLayout )
                    // InternalMyDsl.g:804:3: ruleLayout
                    {
                     before(grammarAccess.getGuiElementAccess().getLayoutParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLayout();

                    state._fsp--;

                     after(grammarAccess.getGuiElementAccess().getLayoutParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:809:2: ( ruleTextfield )
                    {
                    // InternalMyDsl.g:809:2: ( ruleTextfield )
                    // InternalMyDsl.g:810:3: ruleTextfield
                    {
                     before(grammarAccess.getGuiElementAccess().getTextfieldParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleTextfield();

                    state._fsp--;

                     after(grammarAccess.getGuiElementAccess().getTextfieldParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:815:2: ( ruleLabel )
                    {
                    // InternalMyDsl.g:815:2: ( ruleLabel )
                    // InternalMyDsl.g:816:3: ruleLabel
                    {
                     before(grammarAccess.getGuiElementAccess().getLabelParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleLabel();

                    state._fsp--;

                     after(grammarAccess.getGuiElementAccess().getLabelParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:821:2: ( ruleButton )
                    {
                    // InternalMyDsl.g:821:2: ( ruleButton )
                    // InternalMyDsl.g:822:3: ruleButton
                    {
                     before(grammarAccess.getGuiElementAccess().getButtonParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleButton();

                    state._fsp--;

                     after(grammarAccess.getGuiElementAccess().getButtonParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:827:2: ( ruleCheckbox )
                    {
                    // InternalMyDsl.g:827:2: ( ruleCheckbox )
                    // InternalMyDsl.g:828:3: ruleCheckbox
                    {
                     before(grammarAccess.getGuiElementAccess().getCheckboxParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleCheckbox();

                    state._fsp--;

                     after(grammarAccess.getGuiElementAccess().getCheckboxParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:833:2: ( ruleRadiobutton )
                    {
                    // InternalMyDsl.g:833:2: ( ruleRadiobutton )
                    // InternalMyDsl.g:834:3: ruleRadiobutton
                    {
                     before(grammarAccess.getGuiElementAccess().getRadiobuttonParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleRadiobutton();

                    state._fsp--;

                     after(grammarAccess.getGuiElementAccess().getRadiobuttonParserRuleCall_6()); 

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


    // $ANTLR start "rule__CHECKED__Alternatives"
    // InternalMyDsl.g:843:1: rule__CHECKED__Alternatives : ( ( ruleCHECKED_YES ) | ( ruleCHECKED_NO ) );
    public final void rule__CHECKED__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:847:1: ( ( ruleCHECKED_YES ) | ( ruleCHECKED_NO ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            else if ( (LA6_0==12) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:848:2: ( ruleCHECKED_YES )
                    {
                    // InternalMyDsl.g:848:2: ( ruleCHECKED_YES )
                    // InternalMyDsl.g:849:3: ruleCHECKED_YES
                    {
                     before(grammarAccess.getCHECKEDAccess().getCHECKED_YESParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCHECKED_YES();

                    state._fsp--;

                     after(grammarAccess.getCHECKEDAccess().getCHECKED_YESParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:854:2: ( ruleCHECKED_NO )
                    {
                    // InternalMyDsl.g:854:2: ( ruleCHECKED_NO )
                    // InternalMyDsl.g:855:3: ruleCHECKED_NO
                    {
                     before(grammarAccess.getCHECKEDAccess().getCHECKED_NOParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCHECKED_NO();

                    state._fsp--;

                     after(grammarAccess.getCHECKEDAccess().getCHECKED_NOParserRuleCall_1()); 

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
    // $ANTLR end "rule__CHECKED__Alternatives"


    // $ANTLR start "rule__Domainmodel__Group__0"
    // InternalMyDsl.g:864:1: rule__Domainmodel__Group__0 : rule__Domainmodel__Group__0__Impl rule__Domainmodel__Group__1 ;
    public final void rule__Domainmodel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:868:1: ( rule__Domainmodel__Group__0__Impl rule__Domainmodel__Group__1 )
            // InternalMyDsl.g:869:2: rule__Domainmodel__Group__0__Impl rule__Domainmodel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Domainmodel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domainmodel__Group__1();

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
    // $ANTLR end "rule__Domainmodel__Group__0"


    // $ANTLR start "rule__Domainmodel__Group__0__Impl"
    // InternalMyDsl.g:876:1: rule__Domainmodel__Group__0__Impl : ( 'main=' ) ;
    public final void rule__Domainmodel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:880:1: ( ( 'main=' ) )
            // InternalMyDsl.g:881:1: ( 'main=' )
            {
            // InternalMyDsl.g:881:1: ( 'main=' )
            // InternalMyDsl.g:882:2: 'main='
            {
             before(grammarAccess.getDomainmodelAccess().getMainKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDomainmodelAccess().getMainKeyword_0()); 

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
    // $ANTLR end "rule__Domainmodel__Group__0__Impl"


    // $ANTLR start "rule__Domainmodel__Group__1"
    // InternalMyDsl.g:891:1: rule__Domainmodel__Group__1 : rule__Domainmodel__Group__1__Impl rule__Domainmodel__Group__2 ;
    public final void rule__Domainmodel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:895:1: ( rule__Domainmodel__Group__1__Impl rule__Domainmodel__Group__2 )
            // InternalMyDsl.g:896:2: rule__Domainmodel__Group__1__Impl rule__Domainmodel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Domainmodel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domainmodel__Group__2();

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
    // $ANTLR end "rule__Domainmodel__Group__1"


    // $ANTLR start "rule__Domainmodel__Group__1__Impl"
    // InternalMyDsl.g:903:1: rule__Domainmodel__Group__1__Impl : ( ( rule__Domainmodel__MainAssignment_1 ) ) ;
    public final void rule__Domainmodel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:907:1: ( ( ( rule__Domainmodel__MainAssignment_1 ) ) )
            // InternalMyDsl.g:908:1: ( ( rule__Domainmodel__MainAssignment_1 ) )
            {
            // InternalMyDsl.g:908:1: ( ( rule__Domainmodel__MainAssignment_1 ) )
            // InternalMyDsl.g:909:2: ( rule__Domainmodel__MainAssignment_1 )
            {
             before(grammarAccess.getDomainmodelAccess().getMainAssignment_1()); 
            // InternalMyDsl.g:910:2: ( rule__Domainmodel__MainAssignment_1 )
            // InternalMyDsl.g:910:3: rule__Domainmodel__MainAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Domainmodel__MainAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDomainmodelAccess().getMainAssignment_1()); 

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
    // $ANTLR end "rule__Domainmodel__Group__1__Impl"


    // $ANTLR start "rule__Domainmodel__Group__2"
    // InternalMyDsl.g:918:1: rule__Domainmodel__Group__2 : rule__Domainmodel__Group__2__Impl ;
    public final void rule__Domainmodel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:922:1: ( rule__Domainmodel__Group__2__Impl )
            // InternalMyDsl.g:923:2: rule__Domainmodel__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Domainmodel__Group__2__Impl();

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
    // $ANTLR end "rule__Domainmodel__Group__2"


    // $ANTLR start "rule__Domainmodel__Group__2__Impl"
    // InternalMyDsl.g:929:1: rule__Domainmodel__Group__2__Impl : ( ( rule__Domainmodel__ElementsAssignment_2 )* ) ;
    public final void rule__Domainmodel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:933:1: ( ( ( rule__Domainmodel__ElementsAssignment_2 )* ) )
            // InternalMyDsl.g:934:1: ( ( rule__Domainmodel__ElementsAssignment_2 )* )
            {
            // InternalMyDsl.g:934:1: ( ( rule__Domainmodel__ElementsAssignment_2 )* )
            // InternalMyDsl.g:935:2: ( rule__Domainmodel__ElementsAssignment_2 )*
            {
             before(grammarAccess.getDomainmodelAccess().getElementsAssignment_2()); 
            // InternalMyDsl.g:936:2: ( rule__Domainmodel__ElementsAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=14 && LA7_0<=15)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:936:3: rule__Domainmodel__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Domainmodel__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getDomainmodelAccess().getElementsAssignment_2()); 

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
    // $ANTLR end "rule__Domainmodel__Group__2__Impl"


    // $ANTLR start "rule__Frame__Group__0"
    // InternalMyDsl.g:945:1: rule__Frame__Group__0 : rule__Frame__Group__0__Impl rule__Frame__Group__1 ;
    public final void rule__Frame__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:949:1: ( rule__Frame__Group__0__Impl rule__Frame__Group__1 )
            // InternalMyDsl.g:950:2: rule__Frame__Group__0__Impl rule__Frame__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:957:1: rule__Frame__Group__0__Impl : ( 'frame' ) ;
    public final void rule__Frame__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:961:1: ( ( 'frame' ) )
            // InternalMyDsl.g:962:1: ( 'frame' )
            {
            // InternalMyDsl.g:962:1: ( 'frame' )
            // InternalMyDsl.g:963:2: 'frame'
            {
             before(grammarAccess.getFrameAccess().getFrameKeyword_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalMyDsl.g:972:1: rule__Frame__Group__1 : rule__Frame__Group__1__Impl rule__Frame__Group__2 ;
    public final void rule__Frame__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:976:1: ( rule__Frame__Group__1__Impl rule__Frame__Group__2 )
            // InternalMyDsl.g:977:2: rule__Frame__Group__1__Impl rule__Frame__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:984:1: rule__Frame__Group__1__Impl : ( ( rule__Frame__NameAssignment_1 ) ) ;
    public final void rule__Frame__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:988:1: ( ( ( rule__Frame__NameAssignment_1 ) ) )
            // InternalMyDsl.g:989:1: ( ( rule__Frame__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:989:1: ( ( rule__Frame__NameAssignment_1 ) )
            // InternalMyDsl.g:990:2: ( rule__Frame__NameAssignment_1 )
            {
             before(grammarAccess.getFrameAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:991:2: ( rule__Frame__NameAssignment_1 )
            // InternalMyDsl.g:991:3: rule__Frame__NameAssignment_1
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
    // InternalMyDsl.g:999:1: rule__Frame__Group__2 : rule__Frame__Group__2__Impl rule__Frame__Group__3 ;
    public final void rule__Frame__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1003:1: ( rule__Frame__Group__2__Impl rule__Frame__Group__3 )
            // InternalMyDsl.g:1004:2: rule__Frame__Group__2__Impl rule__Frame__Group__3
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
    // InternalMyDsl.g:1011:1: rule__Frame__Group__2__Impl : ( ( rule__Frame__SizeAssignment_2 )? ) ;
    public final void rule__Frame__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1015:1: ( ( ( rule__Frame__SizeAssignment_2 )? ) )
            // InternalMyDsl.g:1016:1: ( ( rule__Frame__SizeAssignment_2 )? )
            {
            // InternalMyDsl.g:1016:1: ( ( rule__Frame__SizeAssignment_2 )? )
            // InternalMyDsl.g:1017:2: ( rule__Frame__SizeAssignment_2 )?
            {
             before(grammarAccess.getFrameAccess().getSizeAssignment_2()); 
            // InternalMyDsl.g:1018:2: ( rule__Frame__SizeAssignment_2 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:1018:3: rule__Frame__SizeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Frame__SizeAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFrameAccess().getSizeAssignment_2()); 

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
    // InternalMyDsl.g:1026:1: rule__Frame__Group__3 : rule__Frame__Group__3__Impl ;
    public final void rule__Frame__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1030:1: ( rule__Frame__Group__3__Impl )
            // InternalMyDsl.g:1031:2: rule__Frame__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Frame__Group__3__Impl();

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
    // InternalMyDsl.g:1037:1: rule__Frame__Group__3__Impl : ( ( rule__Frame__LayoutAssignment_3 )? ) ;
    public final void rule__Frame__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1041:1: ( ( ( rule__Frame__LayoutAssignment_3 )? ) )
            // InternalMyDsl.g:1042:1: ( ( rule__Frame__LayoutAssignment_3 )? )
            {
            // InternalMyDsl.g:1042:1: ( ( rule__Frame__LayoutAssignment_3 )? )
            // InternalMyDsl.g:1043:2: ( rule__Frame__LayoutAssignment_3 )?
            {
             before(grammarAccess.getFrameAccess().getLayoutAssignment_3()); 
            // InternalMyDsl.g:1044:2: ( rule__Frame__LayoutAssignment_3 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16||(LA9_0>=19 && LA9_0<=20)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1044:3: rule__Frame__LayoutAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Frame__LayoutAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFrameAccess().getLayoutAssignment_3()); 

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


    // $ANTLR start "rule__Container__Group__0"
    // InternalMyDsl.g:1053:1: rule__Container__Group__0 : rule__Container__Group__0__Impl rule__Container__Group__1 ;
    public final void rule__Container__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1057:1: ( rule__Container__Group__0__Impl rule__Container__Group__1 )
            // InternalMyDsl.g:1058:2: rule__Container__Group__0__Impl rule__Container__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:1065:1: rule__Container__Group__0__Impl : ( 'container' ) ;
    public final void rule__Container__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1069:1: ( ( 'container' ) )
            // InternalMyDsl.g:1070:1: ( 'container' )
            {
            // InternalMyDsl.g:1070:1: ( 'container' )
            // InternalMyDsl.g:1071:2: 'container'
            {
             before(grammarAccess.getContainerAccess().getContainerKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalMyDsl.g:1080:1: rule__Container__Group__1 : rule__Container__Group__1__Impl rule__Container__Group__2 ;
    public final void rule__Container__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1084:1: ( rule__Container__Group__1__Impl rule__Container__Group__2 )
            // InternalMyDsl.g:1085:2: rule__Container__Group__1__Impl rule__Container__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:1092:1: rule__Container__Group__1__Impl : ( ( rule__Container__NameAssignment_1 ) ) ;
    public final void rule__Container__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1096:1: ( ( ( rule__Container__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1097:1: ( ( rule__Container__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1097:1: ( ( rule__Container__NameAssignment_1 ) )
            // InternalMyDsl.g:1098:2: ( rule__Container__NameAssignment_1 )
            {
             before(grammarAccess.getContainerAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1099:2: ( rule__Container__NameAssignment_1 )
            // InternalMyDsl.g:1099:3: rule__Container__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Container__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getNameAssignment_1()); 

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
    // InternalMyDsl.g:1107:1: rule__Container__Group__2 : rule__Container__Group__2__Impl rule__Container__Group__3 ;
    public final void rule__Container__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1111:1: ( rule__Container__Group__2__Impl rule__Container__Group__3 )
            // InternalMyDsl.g:1112:2: rule__Container__Group__2__Impl rule__Container__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:1119:1: rule__Container__Group__2__Impl : ( ( rule__Container__SizeAssignment_2 )? ) ;
    public final void rule__Container__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1123:1: ( ( ( rule__Container__SizeAssignment_2 )? ) )
            // InternalMyDsl.g:1124:1: ( ( rule__Container__SizeAssignment_2 )? )
            {
            // InternalMyDsl.g:1124:1: ( ( rule__Container__SizeAssignment_2 )? )
            // InternalMyDsl.g:1125:2: ( rule__Container__SizeAssignment_2 )?
            {
             before(grammarAccess.getContainerAccess().getSizeAssignment_2()); 
            // InternalMyDsl.g:1126:2: ( rule__Container__SizeAssignment_2 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1126:3: rule__Container__SizeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Container__SizeAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContainerAccess().getSizeAssignment_2()); 

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
    // InternalMyDsl.g:1134:1: rule__Container__Group__3 : rule__Container__Group__3__Impl ;
    public final void rule__Container__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1138:1: ( rule__Container__Group__3__Impl )
            // InternalMyDsl.g:1139:2: rule__Container__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group__3__Impl();

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
    // InternalMyDsl.g:1145:1: rule__Container__Group__3__Impl : ( ( rule__Container__LayoutAssignment_3 ) ) ;
    public final void rule__Container__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1149:1: ( ( ( rule__Container__LayoutAssignment_3 ) ) )
            // InternalMyDsl.g:1150:1: ( ( rule__Container__LayoutAssignment_3 ) )
            {
            // InternalMyDsl.g:1150:1: ( ( rule__Container__LayoutAssignment_3 ) )
            // InternalMyDsl.g:1151:2: ( rule__Container__LayoutAssignment_3 )
            {
             before(grammarAccess.getContainerAccess().getLayoutAssignment_3()); 
            // InternalMyDsl.g:1152:2: ( rule__Container__LayoutAssignment_3 )
            // InternalMyDsl.g:1152:3: rule__Container__LayoutAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Container__LayoutAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getLayoutAssignment_3()); 

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


    // $ANTLR start "rule__LayoutHorizontal__Group__0"
    // InternalMyDsl.g:1161:1: rule__LayoutHorizontal__Group__0 : rule__LayoutHorizontal__Group__0__Impl rule__LayoutHorizontal__Group__1 ;
    public final void rule__LayoutHorizontal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1165:1: ( rule__LayoutHorizontal__Group__0__Impl rule__LayoutHorizontal__Group__1 )
            // InternalMyDsl.g:1166:2: rule__LayoutHorizontal__Group__0__Impl rule__LayoutHorizontal__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__LayoutHorizontal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayoutHorizontal__Group__1();

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
    // $ANTLR end "rule__LayoutHorizontal__Group__0"


    // $ANTLR start "rule__LayoutHorizontal__Group__0__Impl"
    // InternalMyDsl.g:1173:1: rule__LayoutHorizontal__Group__0__Impl : ( 'horizontal' ) ;
    public final void rule__LayoutHorizontal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1177:1: ( ( 'horizontal' ) )
            // InternalMyDsl.g:1178:1: ( 'horizontal' )
            {
            // InternalMyDsl.g:1178:1: ( 'horizontal' )
            // InternalMyDsl.g:1179:2: 'horizontal'
            {
             before(grammarAccess.getLayoutHorizontalAccess().getHorizontalKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getLayoutHorizontalAccess().getHorizontalKeyword_0()); 

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
    // $ANTLR end "rule__LayoutHorizontal__Group__0__Impl"


    // $ANTLR start "rule__LayoutHorizontal__Group__1"
    // InternalMyDsl.g:1188:1: rule__LayoutHorizontal__Group__1 : rule__LayoutHorizontal__Group__1__Impl rule__LayoutHorizontal__Group__2 ;
    public final void rule__LayoutHorizontal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1192:1: ( rule__LayoutHorizontal__Group__1__Impl rule__LayoutHorizontal__Group__2 )
            // InternalMyDsl.g:1193:2: rule__LayoutHorizontal__Group__1__Impl rule__LayoutHorizontal__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__LayoutHorizontal__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayoutHorizontal__Group__2();

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
    // $ANTLR end "rule__LayoutHorizontal__Group__1"


    // $ANTLR start "rule__LayoutHorizontal__Group__1__Impl"
    // InternalMyDsl.g:1200:1: rule__LayoutHorizontal__Group__1__Impl : ( '{' ) ;
    public final void rule__LayoutHorizontal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1204:1: ( ( '{' ) )
            // InternalMyDsl.g:1205:1: ( '{' )
            {
            // InternalMyDsl.g:1205:1: ( '{' )
            // InternalMyDsl.g:1206:2: '{'
            {
             before(grammarAccess.getLayoutHorizontalAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLayoutHorizontalAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__LayoutHorizontal__Group__1__Impl"


    // $ANTLR start "rule__LayoutHorizontal__Group__2"
    // InternalMyDsl.g:1215:1: rule__LayoutHorizontal__Group__2 : rule__LayoutHorizontal__Group__2__Impl rule__LayoutHorizontal__Group__3 ;
    public final void rule__LayoutHorizontal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1219:1: ( rule__LayoutHorizontal__Group__2__Impl rule__LayoutHorizontal__Group__3 )
            // InternalMyDsl.g:1220:2: rule__LayoutHorizontal__Group__2__Impl rule__LayoutHorizontal__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__LayoutHorizontal__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayoutHorizontal__Group__3();

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
    // $ANTLR end "rule__LayoutHorizontal__Group__2"


    // $ANTLR start "rule__LayoutHorizontal__Group__2__Impl"
    // InternalMyDsl.g:1227:1: rule__LayoutHorizontal__Group__2__Impl : ( ( rule__LayoutHorizontal__EntriesAssignment_2 )* ) ;
    public final void rule__LayoutHorizontal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1231:1: ( ( ( rule__LayoutHorizontal__EntriesAssignment_2 )* ) )
            // InternalMyDsl.g:1232:1: ( ( rule__LayoutHorizontal__EntriesAssignment_2 )* )
            {
            // InternalMyDsl.g:1232:1: ( ( rule__LayoutHorizontal__EntriesAssignment_2 )* )
            // InternalMyDsl.g:1233:2: ( rule__LayoutHorizontal__EntriesAssignment_2 )*
            {
             before(grammarAccess.getLayoutHorizontalAccess().getEntriesAssignment_2()); 
            // InternalMyDsl.g:1234:2: ( rule__LayoutHorizontal__EntriesAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==16||(LA11_0>=19 && LA11_0<=20)||LA11_0==23||(LA11_0>=25 && LA11_0<=29)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1234:3: rule__LayoutHorizontal__EntriesAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__LayoutHorizontal__EntriesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getLayoutHorizontalAccess().getEntriesAssignment_2()); 

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
    // $ANTLR end "rule__LayoutHorizontal__Group__2__Impl"


    // $ANTLR start "rule__LayoutHorizontal__Group__3"
    // InternalMyDsl.g:1242:1: rule__LayoutHorizontal__Group__3 : rule__LayoutHorizontal__Group__3__Impl ;
    public final void rule__LayoutHorizontal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1246:1: ( rule__LayoutHorizontal__Group__3__Impl )
            // InternalMyDsl.g:1247:2: rule__LayoutHorizontal__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LayoutHorizontal__Group__3__Impl();

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
    // $ANTLR end "rule__LayoutHorizontal__Group__3"


    // $ANTLR start "rule__LayoutHorizontal__Group__3__Impl"
    // InternalMyDsl.g:1253:1: rule__LayoutHorizontal__Group__3__Impl : ( '}' ) ;
    public final void rule__LayoutHorizontal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1257:1: ( ( '}' ) )
            // InternalMyDsl.g:1258:1: ( '}' )
            {
            // InternalMyDsl.g:1258:1: ( '}' )
            // InternalMyDsl.g:1259:2: '}'
            {
             before(grammarAccess.getLayoutHorizontalAccess().getRightCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLayoutHorizontalAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__LayoutHorizontal__Group__3__Impl"


    // $ANTLR start "rule__LayoutVertical__Group__0"
    // InternalMyDsl.g:1269:1: rule__LayoutVertical__Group__0 : rule__LayoutVertical__Group__0__Impl rule__LayoutVertical__Group__1 ;
    public final void rule__LayoutVertical__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1273:1: ( rule__LayoutVertical__Group__0__Impl rule__LayoutVertical__Group__1 )
            // InternalMyDsl.g:1274:2: rule__LayoutVertical__Group__0__Impl rule__LayoutVertical__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__LayoutVertical__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayoutVertical__Group__1();

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
    // $ANTLR end "rule__LayoutVertical__Group__0"


    // $ANTLR start "rule__LayoutVertical__Group__0__Impl"
    // InternalMyDsl.g:1281:1: rule__LayoutVertical__Group__0__Impl : ( 'vertical' ) ;
    public final void rule__LayoutVertical__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1285:1: ( ( 'vertical' ) )
            // InternalMyDsl.g:1286:1: ( 'vertical' )
            {
            // InternalMyDsl.g:1286:1: ( 'vertical' )
            // InternalMyDsl.g:1287:2: 'vertical'
            {
             before(grammarAccess.getLayoutVerticalAccess().getVerticalKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLayoutVerticalAccess().getVerticalKeyword_0()); 

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
    // $ANTLR end "rule__LayoutVertical__Group__0__Impl"


    // $ANTLR start "rule__LayoutVertical__Group__1"
    // InternalMyDsl.g:1296:1: rule__LayoutVertical__Group__1 : rule__LayoutVertical__Group__1__Impl rule__LayoutVertical__Group__2 ;
    public final void rule__LayoutVertical__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1300:1: ( rule__LayoutVertical__Group__1__Impl rule__LayoutVertical__Group__2 )
            // InternalMyDsl.g:1301:2: rule__LayoutVertical__Group__1__Impl rule__LayoutVertical__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__LayoutVertical__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayoutVertical__Group__2();

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
    // $ANTLR end "rule__LayoutVertical__Group__1"


    // $ANTLR start "rule__LayoutVertical__Group__1__Impl"
    // InternalMyDsl.g:1308:1: rule__LayoutVertical__Group__1__Impl : ( '{' ) ;
    public final void rule__LayoutVertical__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1312:1: ( ( '{' ) )
            // InternalMyDsl.g:1313:1: ( '{' )
            {
            // InternalMyDsl.g:1313:1: ( '{' )
            // InternalMyDsl.g:1314:2: '{'
            {
             before(grammarAccess.getLayoutVerticalAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLayoutVerticalAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__LayoutVertical__Group__1__Impl"


    // $ANTLR start "rule__LayoutVertical__Group__2"
    // InternalMyDsl.g:1323:1: rule__LayoutVertical__Group__2 : rule__LayoutVertical__Group__2__Impl rule__LayoutVertical__Group__3 ;
    public final void rule__LayoutVertical__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1327:1: ( rule__LayoutVertical__Group__2__Impl rule__LayoutVertical__Group__3 )
            // InternalMyDsl.g:1328:2: rule__LayoutVertical__Group__2__Impl rule__LayoutVertical__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__LayoutVertical__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayoutVertical__Group__3();

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
    // $ANTLR end "rule__LayoutVertical__Group__2"


    // $ANTLR start "rule__LayoutVertical__Group__2__Impl"
    // InternalMyDsl.g:1335:1: rule__LayoutVertical__Group__2__Impl : ( ( rule__LayoutVertical__EntriesAssignment_2 )* ) ;
    public final void rule__LayoutVertical__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1339:1: ( ( ( rule__LayoutVertical__EntriesAssignment_2 )* ) )
            // InternalMyDsl.g:1340:1: ( ( rule__LayoutVertical__EntriesAssignment_2 )* )
            {
            // InternalMyDsl.g:1340:1: ( ( rule__LayoutVertical__EntriesAssignment_2 )* )
            // InternalMyDsl.g:1341:2: ( rule__LayoutVertical__EntriesAssignment_2 )*
            {
             before(grammarAccess.getLayoutVerticalAccess().getEntriesAssignment_2()); 
            // InternalMyDsl.g:1342:2: ( rule__LayoutVertical__EntriesAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||LA12_0==16||(LA12_0>=19 && LA12_0<=20)||LA12_0==23||(LA12_0>=25 && LA12_0<=29)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1342:3: rule__LayoutVertical__EntriesAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__LayoutVertical__EntriesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getLayoutVerticalAccess().getEntriesAssignment_2()); 

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
    // $ANTLR end "rule__LayoutVertical__Group__2__Impl"


    // $ANTLR start "rule__LayoutVertical__Group__3"
    // InternalMyDsl.g:1350:1: rule__LayoutVertical__Group__3 : rule__LayoutVertical__Group__3__Impl ;
    public final void rule__LayoutVertical__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1354:1: ( rule__LayoutVertical__Group__3__Impl )
            // InternalMyDsl.g:1355:2: rule__LayoutVertical__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LayoutVertical__Group__3__Impl();

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
    // $ANTLR end "rule__LayoutVertical__Group__3"


    // $ANTLR start "rule__LayoutVertical__Group__3__Impl"
    // InternalMyDsl.g:1361:1: rule__LayoutVertical__Group__3__Impl : ( '}' ) ;
    public final void rule__LayoutVertical__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1365:1: ( ( '}' ) )
            // InternalMyDsl.g:1366:1: ( '}' )
            {
            // InternalMyDsl.g:1366:1: ( '}' )
            // InternalMyDsl.g:1367:2: '}'
            {
             before(grammarAccess.getLayoutVerticalAccess().getRightCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLayoutVerticalAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__LayoutVertical__Group__3__Impl"


    // $ANTLR start "rule__LayoutPosition__Group__0"
    // InternalMyDsl.g:1377:1: rule__LayoutPosition__Group__0 : rule__LayoutPosition__Group__0__Impl rule__LayoutPosition__Group__1 ;
    public final void rule__LayoutPosition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1381:1: ( rule__LayoutPosition__Group__0__Impl rule__LayoutPosition__Group__1 )
            // InternalMyDsl.g:1382:2: rule__LayoutPosition__Group__0__Impl rule__LayoutPosition__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__LayoutPosition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayoutPosition__Group__1();

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
    // $ANTLR end "rule__LayoutPosition__Group__0"


    // $ANTLR start "rule__LayoutPosition__Group__0__Impl"
    // InternalMyDsl.g:1389:1: rule__LayoutPosition__Group__0__Impl : ( 'positional' ) ;
    public final void rule__LayoutPosition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1393:1: ( ( 'positional' ) )
            // InternalMyDsl.g:1394:1: ( 'positional' )
            {
            // InternalMyDsl.g:1394:1: ( 'positional' )
            // InternalMyDsl.g:1395:2: 'positional'
            {
             before(grammarAccess.getLayoutPositionAccess().getPositionalKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLayoutPositionAccess().getPositionalKeyword_0()); 

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
    // $ANTLR end "rule__LayoutPosition__Group__0__Impl"


    // $ANTLR start "rule__LayoutPosition__Group__1"
    // InternalMyDsl.g:1404:1: rule__LayoutPosition__Group__1 : rule__LayoutPosition__Group__1__Impl rule__LayoutPosition__Group__2 ;
    public final void rule__LayoutPosition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1408:1: ( rule__LayoutPosition__Group__1__Impl rule__LayoutPosition__Group__2 )
            // InternalMyDsl.g:1409:2: rule__LayoutPosition__Group__1__Impl rule__LayoutPosition__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__LayoutPosition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayoutPosition__Group__2();

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
    // $ANTLR end "rule__LayoutPosition__Group__1"


    // $ANTLR start "rule__LayoutPosition__Group__1__Impl"
    // InternalMyDsl.g:1416:1: rule__LayoutPosition__Group__1__Impl : ( '{' ) ;
    public final void rule__LayoutPosition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1420:1: ( ( '{' ) )
            // InternalMyDsl.g:1421:1: ( '{' )
            {
            // InternalMyDsl.g:1421:1: ( '{' )
            // InternalMyDsl.g:1422:2: '{'
            {
             before(grammarAccess.getLayoutPositionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLayoutPositionAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__LayoutPosition__Group__1__Impl"


    // $ANTLR start "rule__LayoutPosition__Group__2"
    // InternalMyDsl.g:1431:1: rule__LayoutPosition__Group__2 : rule__LayoutPosition__Group__2__Impl rule__LayoutPosition__Group__3 ;
    public final void rule__LayoutPosition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1435:1: ( rule__LayoutPosition__Group__2__Impl rule__LayoutPosition__Group__3 )
            // InternalMyDsl.g:1436:2: rule__LayoutPosition__Group__2__Impl rule__LayoutPosition__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__LayoutPosition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayoutPosition__Group__3();

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
    // $ANTLR end "rule__LayoutPosition__Group__2"


    // $ANTLR start "rule__LayoutPosition__Group__2__Impl"
    // InternalMyDsl.g:1443:1: rule__LayoutPosition__Group__2__Impl : ( ( rule__LayoutPosition__EntriesAssignment_2 )* ) ;
    public final void rule__LayoutPosition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1447:1: ( ( ( rule__LayoutPosition__EntriesAssignment_2 )* ) )
            // InternalMyDsl.g:1448:1: ( ( rule__LayoutPosition__EntriesAssignment_2 )* )
            {
            // InternalMyDsl.g:1448:1: ( ( rule__LayoutPosition__EntriesAssignment_2 )* )
            // InternalMyDsl.g:1449:2: ( rule__LayoutPosition__EntriesAssignment_2 )*
            {
             before(grammarAccess.getLayoutPositionAccess().getEntriesAssignment_2()); 
            // InternalMyDsl.g:1450:2: ( rule__LayoutPosition__EntriesAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==21) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:1450:3: rule__LayoutPosition__EntriesAssignment_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__LayoutPosition__EntriesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getLayoutPositionAccess().getEntriesAssignment_2()); 

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
    // $ANTLR end "rule__LayoutPosition__Group__2__Impl"


    // $ANTLR start "rule__LayoutPosition__Group__3"
    // InternalMyDsl.g:1458:1: rule__LayoutPosition__Group__3 : rule__LayoutPosition__Group__3__Impl ;
    public final void rule__LayoutPosition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1462:1: ( rule__LayoutPosition__Group__3__Impl )
            // InternalMyDsl.g:1463:2: rule__LayoutPosition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LayoutPosition__Group__3__Impl();

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
    // $ANTLR end "rule__LayoutPosition__Group__3"


    // $ANTLR start "rule__LayoutPosition__Group__3__Impl"
    // InternalMyDsl.g:1469:1: rule__LayoutPosition__Group__3__Impl : ( '}' ) ;
    public final void rule__LayoutPosition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1473:1: ( ( '}' ) )
            // InternalMyDsl.g:1474:1: ( '}' )
            {
            // InternalMyDsl.g:1474:1: ( '}' )
            // InternalMyDsl.g:1475:2: '}'
            {
             before(grammarAccess.getLayoutPositionAccess().getRightCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLayoutPositionAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__LayoutPosition__Group__3__Impl"


    // $ANTLR start "rule__LayoutPositionEntry__Group__0"
    // InternalMyDsl.g:1485:1: rule__LayoutPositionEntry__Group__0 : rule__LayoutPositionEntry__Group__0__Impl rule__LayoutPositionEntry__Group__1 ;
    public final void rule__LayoutPositionEntry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1489:1: ( rule__LayoutPositionEntry__Group__0__Impl rule__LayoutPositionEntry__Group__1 )
            // InternalMyDsl.g:1490:2: rule__LayoutPositionEntry__Group__0__Impl rule__LayoutPositionEntry__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__LayoutPositionEntry__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayoutPositionEntry__Group__1();

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
    // $ANTLR end "rule__LayoutPositionEntry__Group__0"


    // $ANTLR start "rule__LayoutPositionEntry__Group__0__Impl"
    // InternalMyDsl.g:1497:1: rule__LayoutPositionEntry__Group__0__Impl : ( '[' ) ;
    public final void rule__LayoutPositionEntry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1501:1: ( ( '[' ) )
            // InternalMyDsl.g:1502:1: ( '[' )
            {
            // InternalMyDsl.g:1502:1: ( '[' )
            // InternalMyDsl.g:1503:2: '['
            {
             before(grammarAccess.getLayoutPositionEntryAccess().getLeftSquareBracketKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLayoutPositionEntryAccess().getLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__LayoutPositionEntry__Group__0__Impl"


    // $ANTLR start "rule__LayoutPositionEntry__Group__1"
    // InternalMyDsl.g:1512:1: rule__LayoutPositionEntry__Group__1 : rule__LayoutPositionEntry__Group__1__Impl rule__LayoutPositionEntry__Group__2 ;
    public final void rule__LayoutPositionEntry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1516:1: ( rule__LayoutPositionEntry__Group__1__Impl rule__LayoutPositionEntry__Group__2 )
            // InternalMyDsl.g:1517:2: rule__LayoutPositionEntry__Group__1__Impl rule__LayoutPositionEntry__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__LayoutPositionEntry__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayoutPositionEntry__Group__2();

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
    // $ANTLR end "rule__LayoutPositionEntry__Group__1"


    // $ANTLR start "rule__LayoutPositionEntry__Group__1__Impl"
    // InternalMyDsl.g:1524:1: rule__LayoutPositionEntry__Group__1__Impl : ( ( rule__LayoutPositionEntry__PositionAssignment_1 ) ) ;
    public final void rule__LayoutPositionEntry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1528:1: ( ( ( rule__LayoutPositionEntry__PositionAssignment_1 ) ) )
            // InternalMyDsl.g:1529:1: ( ( rule__LayoutPositionEntry__PositionAssignment_1 ) )
            {
            // InternalMyDsl.g:1529:1: ( ( rule__LayoutPositionEntry__PositionAssignment_1 ) )
            // InternalMyDsl.g:1530:2: ( rule__LayoutPositionEntry__PositionAssignment_1 )
            {
             before(grammarAccess.getLayoutPositionEntryAccess().getPositionAssignment_1()); 
            // InternalMyDsl.g:1531:2: ( rule__LayoutPositionEntry__PositionAssignment_1 )
            // InternalMyDsl.g:1531:3: rule__LayoutPositionEntry__PositionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LayoutPositionEntry__PositionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLayoutPositionEntryAccess().getPositionAssignment_1()); 

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
    // $ANTLR end "rule__LayoutPositionEntry__Group__1__Impl"


    // $ANTLR start "rule__LayoutPositionEntry__Group__2"
    // InternalMyDsl.g:1539:1: rule__LayoutPositionEntry__Group__2 : rule__LayoutPositionEntry__Group__2__Impl rule__LayoutPositionEntry__Group__3 ;
    public final void rule__LayoutPositionEntry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1543:1: ( rule__LayoutPositionEntry__Group__2__Impl rule__LayoutPositionEntry__Group__3 )
            // InternalMyDsl.g:1544:2: rule__LayoutPositionEntry__Group__2__Impl rule__LayoutPositionEntry__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__LayoutPositionEntry__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayoutPositionEntry__Group__3();

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
    // $ANTLR end "rule__LayoutPositionEntry__Group__2"


    // $ANTLR start "rule__LayoutPositionEntry__Group__2__Impl"
    // InternalMyDsl.g:1551:1: rule__LayoutPositionEntry__Group__2__Impl : ( ']' ) ;
    public final void rule__LayoutPositionEntry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1555:1: ( ( ']' ) )
            // InternalMyDsl.g:1556:1: ( ']' )
            {
            // InternalMyDsl.g:1556:1: ( ']' )
            // InternalMyDsl.g:1557:2: ']'
            {
             before(grammarAccess.getLayoutPositionEntryAccess().getRightSquareBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLayoutPositionEntryAccess().getRightSquareBracketKeyword_2()); 

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
    // $ANTLR end "rule__LayoutPositionEntry__Group__2__Impl"


    // $ANTLR start "rule__LayoutPositionEntry__Group__3"
    // InternalMyDsl.g:1566:1: rule__LayoutPositionEntry__Group__3 : rule__LayoutPositionEntry__Group__3__Impl ;
    public final void rule__LayoutPositionEntry__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1570:1: ( rule__LayoutPositionEntry__Group__3__Impl )
            // InternalMyDsl.g:1571:2: rule__LayoutPositionEntry__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LayoutPositionEntry__Group__3__Impl();

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
    // $ANTLR end "rule__LayoutPositionEntry__Group__3"


    // $ANTLR start "rule__LayoutPositionEntry__Group__3__Impl"
    // InternalMyDsl.g:1577:1: rule__LayoutPositionEntry__Group__3__Impl : ( ( rule__LayoutPositionEntry__GuielementAssignment_3 ) ) ;
    public final void rule__LayoutPositionEntry__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1581:1: ( ( ( rule__LayoutPositionEntry__GuielementAssignment_3 ) ) )
            // InternalMyDsl.g:1582:1: ( ( rule__LayoutPositionEntry__GuielementAssignment_3 ) )
            {
            // InternalMyDsl.g:1582:1: ( ( rule__LayoutPositionEntry__GuielementAssignment_3 ) )
            // InternalMyDsl.g:1583:2: ( rule__LayoutPositionEntry__GuielementAssignment_3 )
            {
             before(grammarAccess.getLayoutPositionEntryAccess().getGuielementAssignment_3()); 
            // InternalMyDsl.g:1584:2: ( rule__LayoutPositionEntry__GuielementAssignment_3 )
            // InternalMyDsl.g:1584:3: rule__LayoutPositionEntry__GuielementAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LayoutPositionEntry__GuielementAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLayoutPositionEntryAccess().getGuielementAssignment_3()); 

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
    // $ANTLR end "rule__LayoutPositionEntry__Group__3__Impl"


    // $ANTLR start "rule__Space__Group__0"
    // InternalMyDsl.g:1593:1: rule__Space__Group__0 : rule__Space__Group__0__Impl rule__Space__Group__1 ;
    public final void rule__Space__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1597:1: ( rule__Space__Group__0__Impl rule__Space__Group__1 )
            // InternalMyDsl.g:1598:2: rule__Space__Group__0__Impl rule__Space__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Space__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Space__Group__1();

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
    // $ANTLR end "rule__Space__Group__0"


    // $ANTLR start "rule__Space__Group__0__Impl"
    // InternalMyDsl.g:1605:1: rule__Space__Group__0__Impl : ( 'space' ) ;
    public final void rule__Space__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1609:1: ( ( 'space' ) )
            // InternalMyDsl.g:1610:1: ( 'space' )
            {
            // InternalMyDsl.g:1610:1: ( 'space' )
            // InternalMyDsl.g:1611:2: 'space'
            {
             before(grammarAccess.getSpaceAccess().getSpaceKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSpaceAccess().getSpaceKeyword_0()); 

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
    // $ANTLR end "rule__Space__Group__0__Impl"


    // $ANTLR start "rule__Space__Group__1"
    // InternalMyDsl.g:1620:1: rule__Space__Group__1 : rule__Space__Group__1__Impl ;
    public final void rule__Space__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1624:1: ( rule__Space__Group__1__Impl )
            // InternalMyDsl.g:1625:2: rule__Space__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Space__Group__1__Impl();

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
    // $ANTLR end "rule__Space__Group__1"


    // $ANTLR start "rule__Space__Group__1__Impl"
    // InternalMyDsl.g:1631:1: rule__Space__Group__1__Impl : ( ( rule__Space__SpaceAssignment_1 ) ) ;
    public final void rule__Space__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1635:1: ( ( ( rule__Space__SpaceAssignment_1 ) ) )
            // InternalMyDsl.g:1636:1: ( ( rule__Space__SpaceAssignment_1 ) )
            {
            // InternalMyDsl.g:1636:1: ( ( rule__Space__SpaceAssignment_1 ) )
            // InternalMyDsl.g:1637:2: ( rule__Space__SpaceAssignment_1 )
            {
             before(grammarAccess.getSpaceAccess().getSpaceAssignment_1()); 
            // InternalMyDsl.g:1638:2: ( rule__Space__SpaceAssignment_1 )
            // InternalMyDsl.g:1638:3: rule__Space__SpaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Space__SpaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSpaceAccess().getSpaceAssignment_1()); 

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
    // $ANTLR end "rule__Space__Group__1__Impl"


    // $ANTLR start "rule__PositionValue__Group__0"
    // InternalMyDsl.g:1647:1: rule__PositionValue__Group__0 : rule__PositionValue__Group__0__Impl rule__PositionValue__Group__1 ;
    public final void rule__PositionValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1651:1: ( rule__PositionValue__Group__0__Impl rule__PositionValue__Group__1 )
            // InternalMyDsl.g:1652:2: rule__PositionValue__Group__0__Impl rule__PositionValue__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__PositionValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PositionValue__Group__1();

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
    // $ANTLR end "rule__PositionValue__Group__0"


    // $ANTLR start "rule__PositionValue__Group__0__Impl"
    // InternalMyDsl.g:1659:1: rule__PositionValue__Group__0__Impl : ( ( rule__PositionValue__PosXAssignment_0 ) ) ;
    public final void rule__PositionValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1663:1: ( ( ( rule__PositionValue__PosXAssignment_0 ) ) )
            // InternalMyDsl.g:1664:1: ( ( rule__PositionValue__PosXAssignment_0 ) )
            {
            // InternalMyDsl.g:1664:1: ( ( rule__PositionValue__PosXAssignment_0 ) )
            // InternalMyDsl.g:1665:2: ( rule__PositionValue__PosXAssignment_0 )
            {
             before(grammarAccess.getPositionValueAccess().getPosXAssignment_0()); 
            // InternalMyDsl.g:1666:2: ( rule__PositionValue__PosXAssignment_0 )
            // InternalMyDsl.g:1666:3: rule__PositionValue__PosXAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PositionValue__PosXAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPositionValueAccess().getPosXAssignment_0()); 

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
    // $ANTLR end "rule__PositionValue__Group__0__Impl"


    // $ANTLR start "rule__PositionValue__Group__1"
    // InternalMyDsl.g:1674:1: rule__PositionValue__Group__1 : rule__PositionValue__Group__1__Impl rule__PositionValue__Group__2 ;
    public final void rule__PositionValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1678:1: ( rule__PositionValue__Group__1__Impl rule__PositionValue__Group__2 )
            // InternalMyDsl.g:1679:2: rule__PositionValue__Group__1__Impl rule__PositionValue__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__PositionValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PositionValue__Group__2();

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
    // $ANTLR end "rule__PositionValue__Group__1"


    // $ANTLR start "rule__PositionValue__Group__1__Impl"
    // InternalMyDsl.g:1686:1: rule__PositionValue__Group__1__Impl : ( ',' ) ;
    public final void rule__PositionValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1690:1: ( ( ',' ) )
            // InternalMyDsl.g:1691:1: ( ',' )
            {
            // InternalMyDsl.g:1691:1: ( ',' )
            // InternalMyDsl.g:1692:2: ','
            {
             before(grammarAccess.getPositionValueAccess().getCommaKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPositionValueAccess().getCommaKeyword_1()); 

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
    // $ANTLR end "rule__PositionValue__Group__1__Impl"


    // $ANTLR start "rule__PositionValue__Group__2"
    // InternalMyDsl.g:1701:1: rule__PositionValue__Group__2 : rule__PositionValue__Group__2__Impl ;
    public final void rule__PositionValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1705:1: ( rule__PositionValue__Group__2__Impl )
            // InternalMyDsl.g:1706:2: rule__PositionValue__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PositionValue__Group__2__Impl();

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
    // $ANTLR end "rule__PositionValue__Group__2"


    // $ANTLR start "rule__PositionValue__Group__2__Impl"
    // InternalMyDsl.g:1712:1: rule__PositionValue__Group__2__Impl : ( ( rule__PositionValue__PosYAssignment_2 ) ) ;
    public final void rule__PositionValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1716:1: ( ( ( rule__PositionValue__PosYAssignment_2 ) ) )
            // InternalMyDsl.g:1717:1: ( ( rule__PositionValue__PosYAssignment_2 ) )
            {
            // InternalMyDsl.g:1717:1: ( ( rule__PositionValue__PosYAssignment_2 ) )
            // InternalMyDsl.g:1718:2: ( rule__PositionValue__PosYAssignment_2 )
            {
             before(grammarAccess.getPositionValueAccess().getPosYAssignment_2()); 
            // InternalMyDsl.g:1719:2: ( rule__PositionValue__PosYAssignment_2 )
            // InternalMyDsl.g:1719:3: rule__PositionValue__PosYAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PositionValue__PosYAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPositionValueAccess().getPosYAssignment_2()); 

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
    // $ANTLR end "rule__PositionValue__Group__2__Impl"


    // $ANTLR start "rule__Size__Group__0"
    // InternalMyDsl.g:1728:1: rule__Size__Group__0 : rule__Size__Group__0__Impl rule__Size__Group__1 ;
    public final void rule__Size__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1732:1: ( rule__Size__Group__0__Impl rule__Size__Group__1 )
            // InternalMyDsl.g:1733:2: rule__Size__Group__0__Impl rule__Size__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:1740:1: rule__Size__Group__0__Impl : ( ( rule__Size__WidthAssignment_0 ) ) ;
    public final void rule__Size__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1744:1: ( ( ( rule__Size__WidthAssignment_0 ) ) )
            // InternalMyDsl.g:1745:1: ( ( rule__Size__WidthAssignment_0 ) )
            {
            // InternalMyDsl.g:1745:1: ( ( rule__Size__WidthAssignment_0 ) )
            // InternalMyDsl.g:1746:2: ( rule__Size__WidthAssignment_0 )
            {
             before(grammarAccess.getSizeAccess().getWidthAssignment_0()); 
            // InternalMyDsl.g:1747:2: ( rule__Size__WidthAssignment_0 )
            // InternalMyDsl.g:1747:3: rule__Size__WidthAssignment_0
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
    // InternalMyDsl.g:1755:1: rule__Size__Group__1 : rule__Size__Group__1__Impl rule__Size__Group__2 ;
    public final void rule__Size__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1759:1: ( rule__Size__Group__1__Impl rule__Size__Group__2 )
            // InternalMyDsl.g:1760:2: rule__Size__Group__1__Impl rule__Size__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:1767:1: rule__Size__Group__1__Impl : ( ',' ) ;
    public final void rule__Size__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1771:1: ( ( ',' ) )
            // InternalMyDsl.g:1772:1: ( ',' )
            {
            // InternalMyDsl.g:1772:1: ( ',' )
            // InternalMyDsl.g:1773:2: ','
            {
             before(grammarAccess.getSizeAccess().getCommaKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSizeAccess().getCommaKeyword_1()); 

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
    // InternalMyDsl.g:1782:1: rule__Size__Group__2 : rule__Size__Group__2__Impl ;
    public final void rule__Size__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1786:1: ( rule__Size__Group__2__Impl )
            // InternalMyDsl.g:1787:2: rule__Size__Group__2__Impl
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
    // InternalMyDsl.g:1793:1: rule__Size__Group__2__Impl : ( ( rule__Size__HeightAssignment_2 ) ) ;
    public final void rule__Size__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1797:1: ( ( ( rule__Size__HeightAssignment_2 ) ) )
            // InternalMyDsl.g:1798:1: ( ( rule__Size__HeightAssignment_2 ) )
            {
            // InternalMyDsl.g:1798:1: ( ( rule__Size__HeightAssignment_2 ) )
            // InternalMyDsl.g:1799:2: ( rule__Size__HeightAssignment_2 )
            {
             before(grammarAccess.getSizeAccess().getHeightAssignment_2()); 
            // InternalMyDsl.g:1800:2: ( rule__Size__HeightAssignment_2 )
            // InternalMyDsl.g:1800:3: rule__Size__HeightAssignment_2
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


    // $ANTLR start "rule__ContainerReference__Group__0"
    // InternalMyDsl.g:1809:1: rule__ContainerReference__Group__0 : rule__ContainerReference__Group__0__Impl rule__ContainerReference__Group__1 ;
    public final void rule__ContainerReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1813:1: ( rule__ContainerReference__Group__0__Impl rule__ContainerReference__Group__1 )
            // InternalMyDsl.g:1814:2: rule__ContainerReference__Group__0__Impl rule__ContainerReference__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:1821:1: rule__ContainerReference__Group__0__Impl : ( ( rule__ContainerReference__ReferenceNameAssignment_0 ) ) ;
    public final void rule__ContainerReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1825:1: ( ( ( rule__ContainerReference__ReferenceNameAssignment_0 ) ) )
            // InternalMyDsl.g:1826:1: ( ( rule__ContainerReference__ReferenceNameAssignment_0 ) )
            {
            // InternalMyDsl.g:1826:1: ( ( rule__ContainerReference__ReferenceNameAssignment_0 ) )
            // InternalMyDsl.g:1827:2: ( rule__ContainerReference__ReferenceNameAssignment_0 )
            {
             before(grammarAccess.getContainerReferenceAccess().getReferenceNameAssignment_0()); 
            // InternalMyDsl.g:1828:2: ( rule__ContainerReference__ReferenceNameAssignment_0 )
            // InternalMyDsl.g:1828:3: rule__ContainerReference__ReferenceNameAssignment_0
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
    // InternalMyDsl.g:1836:1: rule__ContainerReference__Group__1 : rule__ContainerReference__Group__1__Impl ;
    public final void rule__ContainerReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1840:1: ( rule__ContainerReference__Group__1__Impl )
            // InternalMyDsl.g:1841:2: rule__ContainerReference__Group__1__Impl
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
    // InternalMyDsl.g:1847:1: rule__ContainerReference__Group__1__Impl : ( ( rule__ContainerReference__NameAssignment_1 ) ) ;
    public final void rule__ContainerReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1851:1: ( ( ( rule__ContainerReference__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1852:1: ( ( rule__ContainerReference__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1852:1: ( ( rule__ContainerReference__NameAssignment_1 ) )
            // InternalMyDsl.g:1853:2: ( rule__ContainerReference__NameAssignment_1 )
            {
             before(grammarAccess.getContainerReferenceAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1854:2: ( rule__ContainerReference__NameAssignment_1 )
            // InternalMyDsl.g:1854:3: rule__ContainerReference__NameAssignment_1
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


    // $ANTLR start "rule__Textfield__Group__0"
    // InternalMyDsl.g:1863:1: rule__Textfield__Group__0 : rule__Textfield__Group__0__Impl rule__Textfield__Group__1 ;
    public final void rule__Textfield__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1867:1: ( rule__Textfield__Group__0__Impl rule__Textfield__Group__1 )
            // InternalMyDsl.g:1868:2: rule__Textfield__Group__0__Impl rule__Textfield__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:1875:1: rule__Textfield__Group__0__Impl : ( 'textfield' ) ;
    public final void rule__Textfield__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1879:1: ( ( 'textfield' ) )
            // InternalMyDsl.g:1880:1: ( 'textfield' )
            {
            // InternalMyDsl.g:1880:1: ( 'textfield' )
            // InternalMyDsl.g:1881:2: 'textfield'
            {
             before(grammarAccess.getTextfieldAccess().getTextfieldKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMyDsl.g:1890:1: rule__Textfield__Group__1 : rule__Textfield__Group__1__Impl rule__Textfield__Group__2 ;
    public final void rule__Textfield__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1894:1: ( rule__Textfield__Group__1__Impl rule__Textfield__Group__2 )
            // InternalMyDsl.g:1895:2: rule__Textfield__Group__1__Impl rule__Textfield__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:1902:1: rule__Textfield__Group__1__Impl : ( ( rule__Textfield__NameAssignment_1 ) ) ;
    public final void rule__Textfield__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1906:1: ( ( ( rule__Textfield__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1907:1: ( ( rule__Textfield__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1907:1: ( ( rule__Textfield__NameAssignment_1 ) )
            // InternalMyDsl.g:1908:2: ( rule__Textfield__NameAssignment_1 )
            {
             before(grammarAccess.getTextfieldAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1909:2: ( rule__Textfield__NameAssignment_1 )
            // InternalMyDsl.g:1909:3: rule__Textfield__NameAssignment_1
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
    // InternalMyDsl.g:1917:1: rule__Textfield__Group__2 : rule__Textfield__Group__2__Impl rule__Textfield__Group__3 ;
    public final void rule__Textfield__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1921:1: ( rule__Textfield__Group__2__Impl rule__Textfield__Group__3 )
            // InternalMyDsl.g:1922:2: rule__Textfield__Group__2__Impl rule__Textfield__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:1929:1: rule__Textfield__Group__2__Impl : ( ( rule__Textfield__SizeAssignment_2 )? ) ;
    public final void rule__Textfield__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1933:1: ( ( ( rule__Textfield__SizeAssignment_2 )? ) )
            // InternalMyDsl.g:1934:1: ( ( rule__Textfield__SizeAssignment_2 )? )
            {
            // InternalMyDsl.g:1934:1: ( ( rule__Textfield__SizeAssignment_2 )? )
            // InternalMyDsl.g:1935:2: ( rule__Textfield__SizeAssignment_2 )?
            {
             before(grammarAccess.getTextfieldAccess().getSizeAssignment_2()); 
            // InternalMyDsl.g:1936:2: ( rule__Textfield__SizeAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1936:3: rule__Textfield__SizeAssignment_2
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
    // InternalMyDsl.g:1944:1: rule__Textfield__Group__3 : rule__Textfield__Group__3__Impl ;
    public final void rule__Textfield__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1948:1: ( rule__Textfield__Group__3__Impl )
            // InternalMyDsl.g:1949:2: rule__Textfield__Group__3__Impl
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
    // InternalMyDsl.g:1955:1: rule__Textfield__Group__3__Impl : ( ( rule__Textfield__TextAssignment_3 ) ) ;
    public final void rule__Textfield__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1959:1: ( ( ( rule__Textfield__TextAssignment_3 ) ) )
            // InternalMyDsl.g:1960:1: ( ( rule__Textfield__TextAssignment_3 ) )
            {
            // InternalMyDsl.g:1960:1: ( ( rule__Textfield__TextAssignment_3 ) )
            // InternalMyDsl.g:1961:2: ( rule__Textfield__TextAssignment_3 )
            {
             before(grammarAccess.getTextfieldAccess().getTextAssignment_3()); 
            // InternalMyDsl.g:1962:2: ( rule__Textfield__TextAssignment_3 )
            // InternalMyDsl.g:1962:3: rule__Textfield__TextAssignment_3
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
    // InternalMyDsl.g:1971:1: rule__Label__Group__0 : rule__Label__Group__0__Impl rule__Label__Group__1 ;
    public final void rule__Label__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1975:1: ( rule__Label__Group__0__Impl rule__Label__Group__1 )
            // InternalMyDsl.g:1976:2: rule__Label__Group__0__Impl rule__Label__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:1983:1: rule__Label__Group__0__Impl : ( 'label' ) ;
    public final void rule__Label__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1987:1: ( ( 'label' ) )
            // InternalMyDsl.g:1988:1: ( 'label' )
            {
            // InternalMyDsl.g:1988:1: ( 'label' )
            // InternalMyDsl.g:1989:2: 'label'
            {
             before(grammarAccess.getLabelAccess().getLabelKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMyDsl.g:1998:1: rule__Label__Group__1 : rule__Label__Group__1__Impl rule__Label__Group__2 ;
    public final void rule__Label__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2002:1: ( rule__Label__Group__1__Impl rule__Label__Group__2 )
            // InternalMyDsl.g:2003:2: rule__Label__Group__1__Impl rule__Label__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:2010:1: rule__Label__Group__1__Impl : ( ( rule__Label__NameAssignment_1 ) ) ;
    public final void rule__Label__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2014:1: ( ( ( rule__Label__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2015:1: ( ( rule__Label__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2015:1: ( ( rule__Label__NameAssignment_1 ) )
            // InternalMyDsl.g:2016:2: ( rule__Label__NameAssignment_1 )
            {
             before(grammarAccess.getLabelAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2017:2: ( rule__Label__NameAssignment_1 )
            // InternalMyDsl.g:2017:3: rule__Label__NameAssignment_1
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
    // InternalMyDsl.g:2025:1: rule__Label__Group__2 : rule__Label__Group__2__Impl rule__Label__Group__3 ;
    public final void rule__Label__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2029:1: ( rule__Label__Group__2__Impl rule__Label__Group__3 )
            // InternalMyDsl.g:2030:2: rule__Label__Group__2__Impl rule__Label__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:2037:1: rule__Label__Group__2__Impl : ( ( rule__Label__SizeAssignment_2 )? ) ;
    public final void rule__Label__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2041:1: ( ( ( rule__Label__SizeAssignment_2 )? ) )
            // InternalMyDsl.g:2042:1: ( ( rule__Label__SizeAssignment_2 )? )
            {
            // InternalMyDsl.g:2042:1: ( ( rule__Label__SizeAssignment_2 )? )
            // InternalMyDsl.g:2043:2: ( rule__Label__SizeAssignment_2 )?
            {
             before(grammarAccess.getLabelAccess().getSizeAssignment_2()); 
            // InternalMyDsl.g:2044:2: ( rule__Label__SizeAssignment_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:2044:3: rule__Label__SizeAssignment_2
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
    // InternalMyDsl.g:2052:1: rule__Label__Group__3 : rule__Label__Group__3__Impl ;
    public final void rule__Label__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2056:1: ( rule__Label__Group__3__Impl )
            // InternalMyDsl.g:2057:2: rule__Label__Group__3__Impl
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
    // InternalMyDsl.g:2063:1: rule__Label__Group__3__Impl : ( ( rule__Label__TextAssignment_3 ) ) ;
    public final void rule__Label__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2067:1: ( ( ( rule__Label__TextAssignment_3 ) ) )
            // InternalMyDsl.g:2068:1: ( ( rule__Label__TextAssignment_3 ) )
            {
            // InternalMyDsl.g:2068:1: ( ( rule__Label__TextAssignment_3 ) )
            // InternalMyDsl.g:2069:2: ( rule__Label__TextAssignment_3 )
            {
             before(grammarAccess.getLabelAccess().getTextAssignment_3()); 
            // InternalMyDsl.g:2070:2: ( rule__Label__TextAssignment_3 )
            // InternalMyDsl.g:2070:3: rule__Label__TextAssignment_3
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
    // InternalMyDsl.g:2079:1: rule__Button__Group__0 : rule__Button__Group__0__Impl rule__Button__Group__1 ;
    public final void rule__Button__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2083:1: ( rule__Button__Group__0__Impl rule__Button__Group__1 )
            // InternalMyDsl.g:2084:2: rule__Button__Group__0__Impl rule__Button__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:2091:1: rule__Button__Group__0__Impl : ( 'button' ) ;
    public final void rule__Button__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2095:1: ( ( 'button' ) )
            // InternalMyDsl.g:2096:1: ( 'button' )
            {
            // InternalMyDsl.g:2096:1: ( 'button' )
            // InternalMyDsl.g:2097:2: 'button'
            {
             before(grammarAccess.getButtonAccess().getButtonKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:2106:1: rule__Button__Group__1 : rule__Button__Group__1__Impl rule__Button__Group__2 ;
    public final void rule__Button__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2110:1: ( rule__Button__Group__1__Impl rule__Button__Group__2 )
            // InternalMyDsl.g:2111:2: rule__Button__Group__1__Impl rule__Button__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:2118:1: rule__Button__Group__1__Impl : ( ( rule__Button__NameAssignment_1 ) ) ;
    public final void rule__Button__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2122:1: ( ( ( rule__Button__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2123:1: ( ( rule__Button__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2123:1: ( ( rule__Button__NameAssignment_1 ) )
            // InternalMyDsl.g:2124:2: ( rule__Button__NameAssignment_1 )
            {
             before(grammarAccess.getButtonAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2125:2: ( rule__Button__NameAssignment_1 )
            // InternalMyDsl.g:2125:3: rule__Button__NameAssignment_1
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
    // InternalMyDsl.g:2133:1: rule__Button__Group__2 : rule__Button__Group__2__Impl rule__Button__Group__3 ;
    public final void rule__Button__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2137:1: ( rule__Button__Group__2__Impl rule__Button__Group__3 )
            // InternalMyDsl.g:2138:2: rule__Button__Group__2__Impl rule__Button__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:2145:1: rule__Button__Group__2__Impl : ( ( rule__Button__SizeAssignment_2 )? ) ;
    public final void rule__Button__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2149:1: ( ( ( rule__Button__SizeAssignment_2 )? ) )
            // InternalMyDsl.g:2150:1: ( ( rule__Button__SizeAssignment_2 )? )
            {
            // InternalMyDsl.g:2150:1: ( ( rule__Button__SizeAssignment_2 )? )
            // InternalMyDsl.g:2151:2: ( rule__Button__SizeAssignment_2 )?
            {
             before(grammarAccess.getButtonAccess().getSizeAssignment_2()); 
            // InternalMyDsl.g:2152:2: ( rule__Button__SizeAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:2152:3: rule__Button__SizeAssignment_2
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
    // InternalMyDsl.g:2160:1: rule__Button__Group__3 : rule__Button__Group__3__Impl ;
    public final void rule__Button__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2164:1: ( rule__Button__Group__3__Impl )
            // InternalMyDsl.g:2165:2: rule__Button__Group__3__Impl
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
    // InternalMyDsl.g:2171:1: rule__Button__Group__3__Impl : ( ( rule__Button__TextAssignment_3 ) ) ;
    public final void rule__Button__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2175:1: ( ( ( rule__Button__TextAssignment_3 ) ) )
            // InternalMyDsl.g:2176:1: ( ( rule__Button__TextAssignment_3 ) )
            {
            // InternalMyDsl.g:2176:1: ( ( rule__Button__TextAssignment_3 ) )
            // InternalMyDsl.g:2177:2: ( rule__Button__TextAssignment_3 )
            {
             before(grammarAccess.getButtonAccess().getTextAssignment_3()); 
            // InternalMyDsl.g:2178:2: ( rule__Button__TextAssignment_3 )
            // InternalMyDsl.g:2178:3: rule__Button__TextAssignment_3
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
    // InternalMyDsl.g:2187:1: rule__Checkbox__Group__0 : rule__Checkbox__Group__0__Impl rule__Checkbox__Group__1 ;
    public final void rule__Checkbox__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2191:1: ( rule__Checkbox__Group__0__Impl rule__Checkbox__Group__1 )
            // InternalMyDsl.g:2192:2: rule__Checkbox__Group__0__Impl rule__Checkbox__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:2199:1: rule__Checkbox__Group__0__Impl : ( 'checkbox' ) ;
    public final void rule__Checkbox__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2203:1: ( ( 'checkbox' ) )
            // InternalMyDsl.g:2204:1: ( 'checkbox' )
            {
            // InternalMyDsl.g:2204:1: ( 'checkbox' )
            // InternalMyDsl.g:2205:2: 'checkbox'
            {
             before(grammarAccess.getCheckboxAccess().getCheckboxKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyDsl.g:2214:1: rule__Checkbox__Group__1 : rule__Checkbox__Group__1__Impl rule__Checkbox__Group__2 ;
    public final void rule__Checkbox__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2218:1: ( rule__Checkbox__Group__1__Impl rule__Checkbox__Group__2 )
            // InternalMyDsl.g:2219:2: rule__Checkbox__Group__1__Impl rule__Checkbox__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:2226:1: rule__Checkbox__Group__1__Impl : ( ( rule__Checkbox__NameAssignment_1 ) ) ;
    public final void rule__Checkbox__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2230:1: ( ( ( rule__Checkbox__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2231:1: ( ( rule__Checkbox__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2231:1: ( ( rule__Checkbox__NameAssignment_1 ) )
            // InternalMyDsl.g:2232:2: ( rule__Checkbox__NameAssignment_1 )
            {
             before(grammarAccess.getCheckboxAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2233:2: ( rule__Checkbox__NameAssignment_1 )
            // InternalMyDsl.g:2233:3: rule__Checkbox__NameAssignment_1
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
    // InternalMyDsl.g:2241:1: rule__Checkbox__Group__2 : rule__Checkbox__Group__2__Impl rule__Checkbox__Group__3 ;
    public final void rule__Checkbox__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2245:1: ( rule__Checkbox__Group__2__Impl rule__Checkbox__Group__3 )
            // InternalMyDsl.g:2246:2: rule__Checkbox__Group__2__Impl rule__Checkbox__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:2253:1: rule__Checkbox__Group__2__Impl : ( ( rule__Checkbox__SizeAssignment_2 )? ) ;
    public final void rule__Checkbox__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2257:1: ( ( ( rule__Checkbox__SizeAssignment_2 )? ) )
            // InternalMyDsl.g:2258:1: ( ( rule__Checkbox__SizeAssignment_2 )? )
            {
            // InternalMyDsl.g:2258:1: ( ( rule__Checkbox__SizeAssignment_2 )? )
            // InternalMyDsl.g:2259:2: ( rule__Checkbox__SizeAssignment_2 )?
            {
             before(grammarAccess.getCheckboxAccess().getSizeAssignment_2()); 
            // InternalMyDsl.g:2260:2: ( rule__Checkbox__SizeAssignment_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:2260:3: rule__Checkbox__SizeAssignment_2
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
    // InternalMyDsl.g:2268:1: rule__Checkbox__Group__3 : rule__Checkbox__Group__3__Impl rule__Checkbox__Group__4 ;
    public final void rule__Checkbox__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2272:1: ( rule__Checkbox__Group__3__Impl rule__Checkbox__Group__4 )
            // InternalMyDsl.g:2273:2: rule__Checkbox__Group__3__Impl rule__Checkbox__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Checkbox__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Checkbox__Group__4();

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
    // InternalMyDsl.g:2280:1: rule__Checkbox__Group__3__Impl : ( ( rule__Checkbox__CheckedAssignment_3 ) ) ;
    public final void rule__Checkbox__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2284:1: ( ( ( rule__Checkbox__CheckedAssignment_3 ) ) )
            // InternalMyDsl.g:2285:1: ( ( rule__Checkbox__CheckedAssignment_3 ) )
            {
            // InternalMyDsl.g:2285:1: ( ( rule__Checkbox__CheckedAssignment_3 ) )
            // InternalMyDsl.g:2286:2: ( rule__Checkbox__CheckedAssignment_3 )
            {
             before(grammarAccess.getCheckboxAccess().getCheckedAssignment_3()); 
            // InternalMyDsl.g:2287:2: ( rule__Checkbox__CheckedAssignment_3 )
            // InternalMyDsl.g:2287:3: rule__Checkbox__CheckedAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Checkbox__CheckedAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCheckboxAccess().getCheckedAssignment_3()); 

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


    // $ANTLR start "rule__Checkbox__Group__4"
    // InternalMyDsl.g:2295:1: rule__Checkbox__Group__4 : rule__Checkbox__Group__4__Impl ;
    public final void rule__Checkbox__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2299:1: ( rule__Checkbox__Group__4__Impl )
            // InternalMyDsl.g:2300:2: rule__Checkbox__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Checkbox__Group__4__Impl();

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
    // $ANTLR end "rule__Checkbox__Group__4"


    // $ANTLR start "rule__Checkbox__Group__4__Impl"
    // InternalMyDsl.g:2306:1: rule__Checkbox__Group__4__Impl : ( ( rule__Checkbox__TextAssignment_4 ) ) ;
    public final void rule__Checkbox__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2310:1: ( ( ( rule__Checkbox__TextAssignment_4 ) ) )
            // InternalMyDsl.g:2311:1: ( ( rule__Checkbox__TextAssignment_4 ) )
            {
            // InternalMyDsl.g:2311:1: ( ( rule__Checkbox__TextAssignment_4 ) )
            // InternalMyDsl.g:2312:2: ( rule__Checkbox__TextAssignment_4 )
            {
             before(grammarAccess.getCheckboxAccess().getTextAssignment_4()); 
            // InternalMyDsl.g:2313:2: ( rule__Checkbox__TextAssignment_4 )
            // InternalMyDsl.g:2313:3: rule__Checkbox__TextAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Checkbox__TextAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCheckboxAccess().getTextAssignment_4()); 

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
    // $ANTLR end "rule__Checkbox__Group__4__Impl"


    // $ANTLR start "rule__Radiobutton__Group__0"
    // InternalMyDsl.g:2322:1: rule__Radiobutton__Group__0 : rule__Radiobutton__Group__0__Impl rule__Radiobutton__Group__1 ;
    public final void rule__Radiobutton__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2326:1: ( rule__Radiobutton__Group__0__Impl rule__Radiobutton__Group__1 )
            // InternalMyDsl.g:2327:2: rule__Radiobutton__Group__0__Impl rule__Radiobutton__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Radiobutton__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Radiobutton__Group__1();

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
    // $ANTLR end "rule__Radiobutton__Group__0"


    // $ANTLR start "rule__Radiobutton__Group__0__Impl"
    // InternalMyDsl.g:2334:1: rule__Radiobutton__Group__0__Impl : ( 'radio' ) ;
    public final void rule__Radiobutton__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2338:1: ( ( 'radio' ) )
            // InternalMyDsl.g:2339:1: ( 'radio' )
            {
            // InternalMyDsl.g:2339:1: ( 'radio' )
            // InternalMyDsl.g:2340:2: 'radio'
            {
             before(grammarAccess.getRadiobuttonAccess().getRadioKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRadiobuttonAccess().getRadioKeyword_0()); 

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
    // $ANTLR end "rule__Radiobutton__Group__0__Impl"


    // $ANTLR start "rule__Radiobutton__Group__1"
    // InternalMyDsl.g:2349:1: rule__Radiobutton__Group__1 : rule__Radiobutton__Group__1__Impl rule__Radiobutton__Group__2 ;
    public final void rule__Radiobutton__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2353:1: ( rule__Radiobutton__Group__1__Impl rule__Radiobutton__Group__2 )
            // InternalMyDsl.g:2354:2: rule__Radiobutton__Group__1__Impl rule__Radiobutton__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Radiobutton__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Radiobutton__Group__2();

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
    // $ANTLR end "rule__Radiobutton__Group__1"


    // $ANTLR start "rule__Radiobutton__Group__1__Impl"
    // InternalMyDsl.g:2361:1: rule__Radiobutton__Group__1__Impl : ( ( rule__Radiobutton__GroupAssignment_1 ) ) ;
    public final void rule__Radiobutton__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2365:1: ( ( ( rule__Radiobutton__GroupAssignment_1 ) ) )
            // InternalMyDsl.g:2366:1: ( ( rule__Radiobutton__GroupAssignment_1 ) )
            {
            // InternalMyDsl.g:2366:1: ( ( rule__Radiobutton__GroupAssignment_1 ) )
            // InternalMyDsl.g:2367:2: ( rule__Radiobutton__GroupAssignment_1 )
            {
             before(grammarAccess.getRadiobuttonAccess().getGroupAssignment_1()); 
            // InternalMyDsl.g:2368:2: ( rule__Radiobutton__GroupAssignment_1 )
            // InternalMyDsl.g:2368:3: rule__Radiobutton__GroupAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Radiobutton__GroupAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRadiobuttonAccess().getGroupAssignment_1()); 

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
    // $ANTLR end "rule__Radiobutton__Group__1__Impl"


    // $ANTLR start "rule__Radiobutton__Group__2"
    // InternalMyDsl.g:2376:1: rule__Radiobutton__Group__2 : rule__Radiobutton__Group__2__Impl rule__Radiobutton__Group__3 ;
    public final void rule__Radiobutton__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2380:1: ( rule__Radiobutton__Group__2__Impl rule__Radiobutton__Group__3 )
            // InternalMyDsl.g:2381:2: rule__Radiobutton__Group__2__Impl rule__Radiobutton__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Radiobutton__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Radiobutton__Group__3();

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
    // $ANTLR end "rule__Radiobutton__Group__2"


    // $ANTLR start "rule__Radiobutton__Group__2__Impl"
    // InternalMyDsl.g:2388:1: rule__Radiobutton__Group__2__Impl : ( ( rule__Radiobutton__NameAssignment_2 ) ) ;
    public final void rule__Radiobutton__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2392:1: ( ( ( rule__Radiobutton__NameAssignment_2 ) ) )
            // InternalMyDsl.g:2393:1: ( ( rule__Radiobutton__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:2393:1: ( ( rule__Radiobutton__NameAssignment_2 ) )
            // InternalMyDsl.g:2394:2: ( rule__Radiobutton__NameAssignment_2 )
            {
             before(grammarAccess.getRadiobuttonAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:2395:2: ( rule__Radiobutton__NameAssignment_2 )
            // InternalMyDsl.g:2395:3: rule__Radiobutton__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Radiobutton__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRadiobuttonAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Radiobutton__Group__2__Impl"


    // $ANTLR start "rule__Radiobutton__Group__3"
    // InternalMyDsl.g:2403:1: rule__Radiobutton__Group__3 : rule__Radiobutton__Group__3__Impl rule__Radiobutton__Group__4 ;
    public final void rule__Radiobutton__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2407:1: ( rule__Radiobutton__Group__3__Impl rule__Radiobutton__Group__4 )
            // InternalMyDsl.g:2408:2: rule__Radiobutton__Group__3__Impl rule__Radiobutton__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Radiobutton__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Radiobutton__Group__4();

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
    // $ANTLR end "rule__Radiobutton__Group__3"


    // $ANTLR start "rule__Radiobutton__Group__3__Impl"
    // InternalMyDsl.g:2415:1: rule__Radiobutton__Group__3__Impl : ( ( rule__Radiobutton__SizeAssignment_3 )? ) ;
    public final void rule__Radiobutton__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2419:1: ( ( ( rule__Radiobutton__SizeAssignment_3 )? ) )
            // InternalMyDsl.g:2420:1: ( ( rule__Radiobutton__SizeAssignment_3 )? )
            {
            // InternalMyDsl.g:2420:1: ( ( rule__Radiobutton__SizeAssignment_3 )? )
            // InternalMyDsl.g:2421:2: ( rule__Radiobutton__SizeAssignment_3 )?
            {
             before(grammarAccess.getRadiobuttonAccess().getSizeAssignment_3()); 
            // InternalMyDsl.g:2422:2: ( rule__Radiobutton__SizeAssignment_3 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_INT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:2422:3: rule__Radiobutton__SizeAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Radiobutton__SizeAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRadiobuttonAccess().getSizeAssignment_3()); 

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
    // $ANTLR end "rule__Radiobutton__Group__3__Impl"


    // $ANTLR start "rule__Radiobutton__Group__4"
    // InternalMyDsl.g:2430:1: rule__Radiobutton__Group__4 : rule__Radiobutton__Group__4__Impl rule__Radiobutton__Group__5 ;
    public final void rule__Radiobutton__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2434:1: ( rule__Radiobutton__Group__4__Impl rule__Radiobutton__Group__5 )
            // InternalMyDsl.g:2435:2: rule__Radiobutton__Group__4__Impl rule__Radiobutton__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__Radiobutton__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Radiobutton__Group__5();

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
    // $ANTLR end "rule__Radiobutton__Group__4"


    // $ANTLR start "rule__Radiobutton__Group__4__Impl"
    // InternalMyDsl.g:2442:1: rule__Radiobutton__Group__4__Impl : ( ( rule__Radiobutton__CheckedAssignment_4 )? ) ;
    public final void rule__Radiobutton__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2446:1: ( ( ( rule__Radiobutton__CheckedAssignment_4 )? ) )
            // InternalMyDsl.g:2447:1: ( ( rule__Radiobutton__CheckedAssignment_4 )? )
            {
            // InternalMyDsl.g:2447:1: ( ( rule__Radiobutton__CheckedAssignment_4 )? )
            // InternalMyDsl.g:2448:2: ( rule__Radiobutton__CheckedAssignment_4 )?
            {
             before(grammarAccess.getRadiobuttonAccess().getCheckedAssignment_4()); 
            // InternalMyDsl.g:2449:2: ( rule__Radiobutton__CheckedAssignment_4 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==11) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:2449:3: rule__Radiobutton__CheckedAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Radiobutton__CheckedAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRadiobuttonAccess().getCheckedAssignment_4()); 

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
    // $ANTLR end "rule__Radiobutton__Group__4__Impl"


    // $ANTLR start "rule__Radiobutton__Group__5"
    // InternalMyDsl.g:2457:1: rule__Radiobutton__Group__5 : rule__Radiobutton__Group__5__Impl ;
    public final void rule__Radiobutton__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2461:1: ( rule__Radiobutton__Group__5__Impl )
            // InternalMyDsl.g:2462:2: rule__Radiobutton__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Radiobutton__Group__5__Impl();

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
    // $ANTLR end "rule__Radiobutton__Group__5"


    // $ANTLR start "rule__Radiobutton__Group__5__Impl"
    // InternalMyDsl.g:2468:1: rule__Radiobutton__Group__5__Impl : ( ( rule__Radiobutton__TextAssignment_5 ) ) ;
    public final void rule__Radiobutton__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2472:1: ( ( ( rule__Radiobutton__TextAssignment_5 ) ) )
            // InternalMyDsl.g:2473:1: ( ( rule__Radiobutton__TextAssignment_5 ) )
            {
            // InternalMyDsl.g:2473:1: ( ( rule__Radiobutton__TextAssignment_5 ) )
            // InternalMyDsl.g:2474:2: ( rule__Radiobutton__TextAssignment_5 )
            {
             before(grammarAccess.getRadiobuttonAccess().getTextAssignment_5()); 
            // InternalMyDsl.g:2475:2: ( rule__Radiobutton__TextAssignment_5 )
            // InternalMyDsl.g:2475:3: rule__Radiobutton__TextAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Radiobutton__TextAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRadiobuttonAccess().getTextAssignment_5()); 

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
    // $ANTLR end "rule__Radiobutton__Group__5__Impl"


    // $ANTLR start "rule__Domainmodel__MainAssignment_1"
    // InternalMyDsl.g:2484:1: rule__Domainmodel__MainAssignment_1 : ( ruleNAME ) ;
    public final void rule__Domainmodel__MainAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2488:1: ( ( ruleNAME ) )
            // InternalMyDsl.g:2489:2: ( ruleNAME )
            {
            // InternalMyDsl.g:2489:2: ( ruleNAME )
            // InternalMyDsl.g:2490:3: ruleNAME
            {
             before(grammarAccess.getDomainmodelAccess().getMainNAMEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNAME();

            state._fsp--;

             after(grammarAccess.getDomainmodelAccess().getMainNAMEParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Domainmodel__MainAssignment_1"


    // $ANTLR start "rule__Domainmodel__ElementsAssignment_2"
    // InternalMyDsl.g:2499:1: rule__Domainmodel__ElementsAssignment_2 : ( ruleType ) ;
    public final void rule__Domainmodel__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2503:1: ( ( ruleType ) )
            // InternalMyDsl.g:2504:2: ( ruleType )
            {
            // InternalMyDsl.g:2504:2: ( ruleType )
            // InternalMyDsl.g:2505:3: ruleType
            {
             before(grammarAccess.getDomainmodelAccess().getElementsTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getDomainmodelAccess().getElementsTypeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Domainmodel__ElementsAssignment_2"


    // $ANTLR start "rule__Frame__NameAssignment_1"
    // InternalMyDsl.g:2514:1: rule__Frame__NameAssignment_1 : ( ruleNAME ) ;
    public final void rule__Frame__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2518:1: ( ( ruleNAME ) )
            // InternalMyDsl.g:2519:2: ( ruleNAME )
            {
            // InternalMyDsl.g:2519:2: ( ruleNAME )
            // InternalMyDsl.g:2520:3: ruleNAME
            {
             before(grammarAccess.getFrameAccess().getNameNAMEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNAME();

            state._fsp--;

             after(grammarAccess.getFrameAccess().getNameNAMEParserRuleCall_1_0()); 

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


    // $ANTLR start "rule__Frame__SizeAssignment_2"
    // InternalMyDsl.g:2529:1: rule__Frame__SizeAssignment_2 : ( ruleSize ) ;
    public final void rule__Frame__SizeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2533:1: ( ( ruleSize ) )
            // InternalMyDsl.g:2534:2: ( ruleSize )
            {
            // InternalMyDsl.g:2534:2: ( ruleSize )
            // InternalMyDsl.g:2535:3: ruleSize
            {
             before(grammarAccess.getFrameAccess().getSizeSizeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSize();

            state._fsp--;

             after(grammarAccess.getFrameAccess().getSizeSizeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Frame__SizeAssignment_2"


    // $ANTLR start "rule__Frame__LayoutAssignment_3"
    // InternalMyDsl.g:2544:1: rule__Frame__LayoutAssignment_3 : ( ruleLayout ) ;
    public final void rule__Frame__LayoutAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2548:1: ( ( ruleLayout ) )
            // InternalMyDsl.g:2549:2: ( ruleLayout )
            {
            // InternalMyDsl.g:2549:2: ( ruleLayout )
            // InternalMyDsl.g:2550:3: ruleLayout
            {
             before(grammarAccess.getFrameAccess().getLayoutLayoutParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLayout();

            state._fsp--;

             after(grammarAccess.getFrameAccess().getLayoutLayoutParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Frame__LayoutAssignment_3"


    // $ANTLR start "rule__Container__NameAssignment_1"
    // InternalMyDsl.g:2559:1: rule__Container__NameAssignment_1 : ( ruleNAME ) ;
    public final void rule__Container__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2563:1: ( ( ruleNAME ) )
            // InternalMyDsl.g:2564:2: ( ruleNAME )
            {
            // InternalMyDsl.g:2564:2: ( ruleNAME )
            // InternalMyDsl.g:2565:3: ruleNAME
            {
             before(grammarAccess.getContainerAccess().getNameNAMEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNAME();

            state._fsp--;

             after(grammarAccess.getContainerAccess().getNameNAMEParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Container__NameAssignment_1"


    // $ANTLR start "rule__Container__SizeAssignment_2"
    // InternalMyDsl.g:2574:1: rule__Container__SizeAssignment_2 : ( ruleSize ) ;
    public final void rule__Container__SizeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2578:1: ( ( ruleSize ) )
            // InternalMyDsl.g:2579:2: ( ruleSize )
            {
            // InternalMyDsl.g:2579:2: ( ruleSize )
            // InternalMyDsl.g:2580:3: ruleSize
            {
             before(grammarAccess.getContainerAccess().getSizeSizeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSize();

            state._fsp--;

             after(grammarAccess.getContainerAccess().getSizeSizeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Container__SizeAssignment_2"


    // $ANTLR start "rule__Container__LayoutAssignment_3"
    // InternalMyDsl.g:2589:1: rule__Container__LayoutAssignment_3 : ( ruleLayout ) ;
    public final void rule__Container__LayoutAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2593:1: ( ( ruleLayout ) )
            // InternalMyDsl.g:2594:2: ( ruleLayout )
            {
            // InternalMyDsl.g:2594:2: ( ruleLayout )
            // InternalMyDsl.g:2595:3: ruleLayout
            {
             before(grammarAccess.getContainerAccess().getLayoutLayoutParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLayout();

            state._fsp--;

             after(grammarAccess.getContainerAccess().getLayoutLayoutParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Container__LayoutAssignment_3"


    // $ANTLR start "rule__LayoutHorizontal__EntriesAssignment_2"
    // InternalMyDsl.g:2604:1: rule__LayoutHorizontal__EntriesAssignment_2 : ( ruleLayoutHorizontalEntry ) ;
    public final void rule__LayoutHorizontal__EntriesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2608:1: ( ( ruleLayoutHorizontalEntry ) )
            // InternalMyDsl.g:2609:2: ( ruleLayoutHorizontalEntry )
            {
            // InternalMyDsl.g:2609:2: ( ruleLayoutHorizontalEntry )
            // InternalMyDsl.g:2610:3: ruleLayoutHorizontalEntry
            {
             before(grammarAccess.getLayoutHorizontalAccess().getEntriesLayoutHorizontalEntryParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLayoutHorizontalEntry();

            state._fsp--;

             after(grammarAccess.getLayoutHorizontalAccess().getEntriesLayoutHorizontalEntryParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__LayoutHorizontal__EntriesAssignment_2"


    // $ANTLR start "rule__LayoutHorizontalEntry__SpaceAssignment_0"
    // InternalMyDsl.g:2619:1: rule__LayoutHorizontalEntry__SpaceAssignment_0 : ( ruleSpace ) ;
    public final void rule__LayoutHorizontalEntry__SpaceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2623:1: ( ( ruleSpace ) )
            // InternalMyDsl.g:2624:2: ( ruleSpace )
            {
            // InternalMyDsl.g:2624:2: ( ruleSpace )
            // InternalMyDsl.g:2625:3: ruleSpace
            {
             before(grammarAccess.getLayoutHorizontalEntryAccess().getSpaceSpaceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSpace();

            state._fsp--;

             after(grammarAccess.getLayoutHorizontalEntryAccess().getSpaceSpaceParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__LayoutHorizontalEntry__SpaceAssignment_0"


    // $ANTLR start "rule__LayoutHorizontalEntry__GuielementAssignment_1"
    // InternalMyDsl.g:2634:1: rule__LayoutHorizontalEntry__GuielementAssignment_1 : ( ruleGuiElement ) ;
    public final void rule__LayoutHorizontalEntry__GuielementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2638:1: ( ( ruleGuiElement ) )
            // InternalMyDsl.g:2639:2: ( ruleGuiElement )
            {
            // InternalMyDsl.g:2639:2: ( ruleGuiElement )
            // InternalMyDsl.g:2640:3: ruleGuiElement
            {
             before(grammarAccess.getLayoutHorizontalEntryAccess().getGuielementGuiElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGuiElement();

            state._fsp--;

             after(grammarAccess.getLayoutHorizontalEntryAccess().getGuielementGuiElementParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__LayoutHorizontalEntry__GuielementAssignment_1"


    // $ANTLR start "rule__LayoutVertical__EntriesAssignment_2"
    // InternalMyDsl.g:2649:1: rule__LayoutVertical__EntriesAssignment_2 : ( ruleLayoutVerticalEntry ) ;
    public final void rule__LayoutVertical__EntriesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2653:1: ( ( ruleLayoutVerticalEntry ) )
            // InternalMyDsl.g:2654:2: ( ruleLayoutVerticalEntry )
            {
            // InternalMyDsl.g:2654:2: ( ruleLayoutVerticalEntry )
            // InternalMyDsl.g:2655:3: ruleLayoutVerticalEntry
            {
             before(grammarAccess.getLayoutVerticalAccess().getEntriesLayoutVerticalEntryParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLayoutVerticalEntry();

            state._fsp--;

             after(grammarAccess.getLayoutVerticalAccess().getEntriesLayoutVerticalEntryParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__LayoutVertical__EntriesAssignment_2"


    // $ANTLR start "rule__LayoutVerticalEntry__SpaceAssignment_0"
    // InternalMyDsl.g:2664:1: rule__LayoutVerticalEntry__SpaceAssignment_0 : ( ruleSpace ) ;
    public final void rule__LayoutVerticalEntry__SpaceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2668:1: ( ( ruleSpace ) )
            // InternalMyDsl.g:2669:2: ( ruleSpace )
            {
            // InternalMyDsl.g:2669:2: ( ruleSpace )
            // InternalMyDsl.g:2670:3: ruleSpace
            {
             before(grammarAccess.getLayoutVerticalEntryAccess().getSpaceSpaceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSpace();

            state._fsp--;

             after(grammarAccess.getLayoutVerticalEntryAccess().getSpaceSpaceParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__LayoutVerticalEntry__SpaceAssignment_0"


    // $ANTLR start "rule__LayoutVerticalEntry__GuielementAssignment_1"
    // InternalMyDsl.g:2679:1: rule__LayoutVerticalEntry__GuielementAssignment_1 : ( ruleGuiElement ) ;
    public final void rule__LayoutVerticalEntry__GuielementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2683:1: ( ( ruleGuiElement ) )
            // InternalMyDsl.g:2684:2: ( ruleGuiElement )
            {
            // InternalMyDsl.g:2684:2: ( ruleGuiElement )
            // InternalMyDsl.g:2685:3: ruleGuiElement
            {
             before(grammarAccess.getLayoutVerticalEntryAccess().getGuielementGuiElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGuiElement();

            state._fsp--;

             after(grammarAccess.getLayoutVerticalEntryAccess().getGuielementGuiElementParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__LayoutVerticalEntry__GuielementAssignment_1"


    // $ANTLR start "rule__LayoutPosition__EntriesAssignment_2"
    // InternalMyDsl.g:2694:1: rule__LayoutPosition__EntriesAssignment_2 : ( ruleLayoutPositionEntry ) ;
    public final void rule__LayoutPosition__EntriesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2698:1: ( ( ruleLayoutPositionEntry ) )
            // InternalMyDsl.g:2699:2: ( ruleLayoutPositionEntry )
            {
            // InternalMyDsl.g:2699:2: ( ruleLayoutPositionEntry )
            // InternalMyDsl.g:2700:3: ruleLayoutPositionEntry
            {
             before(grammarAccess.getLayoutPositionAccess().getEntriesLayoutPositionEntryParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLayoutPositionEntry();

            state._fsp--;

             after(grammarAccess.getLayoutPositionAccess().getEntriesLayoutPositionEntryParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__LayoutPosition__EntriesAssignment_2"


    // $ANTLR start "rule__LayoutPositionEntry__PositionAssignment_1"
    // InternalMyDsl.g:2709:1: rule__LayoutPositionEntry__PositionAssignment_1 : ( rulePositionValue ) ;
    public final void rule__LayoutPositionEntry__PositionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2713:1: ( ( rulePositionValue ) )
            // InternalMyDsl.g:2714:2: ( rulePositionValue )
            {
            // InternalMyDsl.g:2714:2: ( rulePositionValue )
            // InternalMyDsl.g:2715:3: rulePositionValue
            {
             before(grammarAccess.getLayoutPositionEntryAccess().getPositionPositionValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePositionValue();

            state._fsp--;

             after(grammarAccess.getLayoutPositionEntryAccess().getPositionPositionValueParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__LayoutPositionEntry__PositionAssignment_1"


    // $ANTLR start "rule__LayoutPositionEntry__GuielementAssignment_3"
    // InternalMyDsl.g:2724:1: rule__LayoutPositionEntry__GuielementAssignment_3 : ( ruleGuiElement ) ;
    public final void rule__LayoutPositionEntry__GuielementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2728:1: ( ( ruleGuiElement ) )
            // InternalMyDsl.g:2729:2: ( ruleGuiElement )
            {
            // InternalMyDsl.g:2729:2: ( ruleGuiElement )
            // InternalMyDsl.g:2730:3: ruleGuiElement
            {
             before(grammarAccess.getLayoutPositionEntryAccess().getGuielementGuiElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleGuiElement();

            state._fsp--;

             after(grammarAccess.getLayoutPositionEntryAccess().getGuielementGuiElementParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__LayoutPositionEntry__GuielementAssignment_3"


    // $ANTLR start "rule__Space__SpaceAssignment_1"
    // InternalMyDsl.g:2739:1: rule__Space__SpaceAssignment_1 : ( RULE_INT ) ;
    public final void rule__Space__SpaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2743:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2744:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2744:2: ( RULE_INT )
            // InternalMyDsl.g:2745:3: RULE_INT
            {
             before(grammarAccess.getSpaceAccess().getSpaceINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSpaceAccess().getSpaceINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Space__SpaceAssignment_1"


    // $ANTLR start "rule__PositionValue__PosXAssignment_0"
    // InternalMyDsl.g:2754:1: rule__PositionValue__PosXAssignment_0 : ( RULE_INT ) ;
    public final void rule__PositionValue__PosXAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2758:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2759:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2759:2: ( RULE_INT )
            // InternalMyDsl.g:2760:3: RULE_INT
            {
             before(grammarAccess.getPositionValueAccess().getPosXINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPositionValueAccess().getPosXINTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__PositionValue__PosXAssignment_0"


    // $ANTLR start "rule__PositionValue__PosYAssignment_2"
    // InternalMyDsl.g:2769:1: rule__PositionValue__PosYAssignment_2 : ( RULE_INT ) ;
    public final void rule__PositionValue__PosYAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2773:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2774:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2774:2: ( RULE_INT )
            // InternalMyDsl.g:2775:3: RULE_INT
            {
             before(grammarAccess.getPositionValueAccess().getPosYINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPositionValueAccess().getPosYINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__PositionValue__PosYAssignment_2"


    // $ANTLR start "rule__Size__WidthAssignment_0"
    // InternalMyDsl.g:2784:1: rule__Size__WidthAssignment_0 : ( RULE_INT ) ;
    public final void rule__Size__WidthAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2788:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2789:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2789:2: ( RULE_INT )
            // InternalMyDsl.g:2790:3: RULE_INT
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
    // InternalMyDsl.g:2799:1: rule__Size__HeightAssignment_2 : ( RULE_INT ) ;
    public final void rule__Size__HeightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2803:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2804:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2804:2: ( RULE_INT )
            // InternalMyDsl.g:2805:3: RULE_INT
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


    // $ANTLR start "rule__ContainerReference__ReferenceNameAssignment_0"
    // InternalMyDsl.g:2814:1: rule__ContainerReference__ReferenceNameAssignment_0 : ( ruleNAME ) ;
    public final void rule__ContainerReference__ReferenceNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2818:1: ( ( ruleNAME ) )
            // InternalMyDsl.g:2819:2: ( ruleNAME )
            {
            // InternalMyDsl.g:2819:2: ( ruleNAME )
            // InternalMyDsl.g:2820:3: ruleNAME
            {
             before(grammarAccess.getContainerReferenceAccess().getReferenceNameNAMEParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNAME();

            state._fsp--;

             after(grammarAccess.getContainerReferenceAccess().getReferenceNameNAMEParserRuleCall_0_0()); 

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
    // InternalMyDsl.g:2829:1: rule__ContainerReference__NameAssignment_1 : ( ruleNAME ) ;
    public final void rule__ContainerReference__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2833:1: ( ( ruleNAME ) )
            // InternalMyDsl.g:2834:2: ( ruleNAME )
            {
            // InternalMyDsl.g:2834:2: ( ruleNAME )
            // InternalMyDsl.g:2835:3: ruleNAME
            {
             before(grammarAccess.getContainerReferenceAccess().getNameNAMEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNAME();

            state._fsp--;

             after(grammarAccess.getContainerReferenceAccess().getNameNAMEParserRuleCall_1_0()); 

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


    // $ANTLR start "rule__Text__TextAssignment"
    // InternalMyDsl.g:2844:1: rule__Text__TextAssignment : ( RULE_STRING ) ;
    public final void rule__Text__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2848:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2849:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2849:2: ( RULE_STRING )
            // InternalMyDsl.g:2850:3: RULE_STRING
            {
             before(grammarAccess.getTextAccess().getTextSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getTextSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Text__TextAssignment"


    // $ANTLR start "rule__Textfield__NameAssignment_1"
    // InternalMyDsl.g:2859:1: rule__Textfield__NameAssignment_1 : ( ruleNAME ) ;
    public final void rule__Textfield__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2863:1: ( ( ruleNAME ) )
            // InternalMyDsl.g:2864:2: ( ruleNAME )
            {
            // InternalMyDsl.g:2864:2: ( ruleNAME )
            // InternalMyDsl.g:2865:3: ruleNAME
            {
             before(grammarAccess.getTextfieldAccess().getNameNAMEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNAME();

            state._fsp--;

             after(grammarAccess.getTextfieldAccess().getNameNAMEParserRuleCall_1_0()); 

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
    // InternalMyDsl.g:2874:1: rule__Textfield__SizeAssignment_2 : ( ruleSize ) ;
    public final void rule__Textfield__SizeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2878:1: ( ( ruleSize ) )
            // InternalMyDsl.g:2879:2: ( ruleSize )
            {
            // InternalMyDsl.g:2879:2: ( ruleSize )
            // InternalMyDsl.g:2880:3: ruleSize
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
    // InternalMyDsl.g:2889:1: rule__Textfield__TextAssignment_3 : ( ruleText ) ;
    public final void rule__Textfield__TextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2893:1: ( ( ruleText ) )
            // InternalMyDsl.g:2894:2: ( ruleText )
            {
            // InternalMyDsl.g:2894:2: ( ruleText )
            // InternalMyDsl.g:2895:3: ruleText
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
    // InternalMyDsl.g:2904:1: rule__Label__NameAssignment_1 : ( ruleNAME ) ;
    public final void rule__Label__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2908:1: ( ( ruleNAME ) )
            // InternalMyDsl.g:2909:2: ( ruleNAME )
            {
            // InternalMyDsl.g:2909:2: ( ruleNAME )
            // InternalMyDsl.g:2910:3: ruleNAME
            {
             before(grammarAccess.getLabelAccess().getNameNAMEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNAME();

            state._fsp--;

             after(grammarAccess.getLabelAccess().getNameNAMEParserRuleCall_1_0()); 

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
    // InternalMyDsl.g:2919:1: rule__Label__SizeAssignment_2 : ( ruleSize ) ;
    public final void rule__Label__SizeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2923:1: ( ( ruleSize ) )
            // InternalMyDsl.g:2924:2: ( ruleSize )
            {
            // InternalMyDsl.g:2924:2: ( ruleSize )
            // InternalMyDsl.g:2925:3: ruleSize
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
    // InternalMyDsl.g:2934:1: rule__Label__TextAssignment_3 : ( ruleText ) ;
    public final void rule__Label__TextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2938:1: ( ( ruleText ) )
            // InternalMyDsl.g:2939:2: ( ruleText )
            {
            // InternalMyDsl.g:2939:2: ( ruleText )
            // InternalMyDsl.g:2940:3: ruleText
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
    // InternalMyDsl.g:2949:1: rule__Button__NameAssignment_1 : ( ruleNAME ) ;
    public final void rule__Button__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2953:1: ( ( ruleNAME ) )
            // InternalMyDsl.g:2954:2: ( ruleNAME )
            {
            // InternalMyDsl.g:2954:2: ( ruleNAME )
            // InternalMyDsl.g:2955:3: ruleNAME
            {
             before(grammarAccess.getButtonAccess().getNameNAMEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNAME();

            state._fsp--;

             after(grammarAccess.getButtonAccess().getNameNAMEParserRuleCall_1_0()); 

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
    // InternalMyDsl.g:2964:1: rule__Button__SizeAssignment_2 : ( ruleSize ) ;
    public final void rule__Button__SizeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2968:1: ( ( ruleSize ) )
            // InternalMyDsl.g:2969:2: ( ruleSize )
            {
            // InternalMyDsl.g:2969:2: ( ruleSize )
            // InternalMyDsl.g:2970:3: ruleSize
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
    // InternalMyDsl.g:2979:1: rule__Button__TextAssignment_3 : ( ruleText ) ;
    public final void rule__Button__TextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2983:1: ( ( ruleText ) )
            // InternalMyDsl.g:2984:2: ( ruleText )
            {
            // InternalMyDsl.g:2984:2: ( ruleText )
            // InternalMyDsl.g:2985:3: ruleText
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
    // InternalMyDsl.g:2994:1: rule__Checkbox__NameAssignment_1 : ( ruleNAME ) ;
    public final void rule__Checkbox__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2998:1: ( ( ruleNAME ) )
            // InternalMyDsl.g:2999:2: ( ruleNAME )
            {
            // InternalMyDsl.g:2999:2: ( ruleNAME )
            // InternalMyDsl.g:3000:3: ruleNAME
            {
             before(grammarAccess.getCheckboxAccess().getNameNAMEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNAME();

            state._fsp--;

             after(grammarAccess.getCheckboxAccess().getNameNAMEParserRuleCall_1_0()); 

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
    // InternalMyDsl.g:3009:1: rule__Checkbox__SizeAssignment_2 : ( ruleSize ) ;
    public final void rule__Checkbox__SizeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3013:1: ( ( ruleSize ) )
            // InternalMyDsl.g:3014:2: ( ruleSize )
            {
            // InternalMyDsl.g:3014:2: ( ruleSize )
            // InternalMyDsl.g:3015:3: ruleSize
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


    // $ANTLR start "rule__Checkbox__CheckedAssignment_3"
    // InternalMyDsl.g:3024:1: rule__Checkbox__CheckedAssignment_3 : ( ruleCHECKED ) ;
    public final void rule__Checkbox__CheckedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3028:1: ( ( ruleCHECKED ) )
            // InternalMyDsl.g:3029:2: ( ruleCHECKED )
            {
            // InternalMyDsl.g:3029:2: ( ruleCHECKED )
            // InternalMyDsl.g:3030:3: ruleCHECKED
            {
             before(grammarAccess.getCheckboxAccess().getCheckedCHECKEDParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCHECKED();

            state._fsp--;

             after(grammarAccess.getCheckboxAccess().getCheckedCHECKEDParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Checkbox__CheckedAssignment_3"


    // $ANTLR start "rule__Checkbox__TextAssignment_4"
    // InternalMyDsl.g:3039:1: rule__Checkbox__TextAssignment_4 : ( ruleText ) ;
    public final void rule__Checkbox__TextAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3043:1: ( ( ruleText ) )
            // InternalMyDsl.g:3044:2: ( ruleText )
            {
            // InternalMyDsl.g:3044:2: ( ruleText )
            // InternalMyDsl.g:3045:3: ruleText
            {
             before(grammarAccess.getCheckboxAccess().getTextTextParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getCheckboxAccess().getTextTextParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Checkbox__TextAssignment_4"


    // $ANTLR start "rule__Radiobutton__GroupAssignment_1"
    // InternalMyDsl.g:3054:1: rule__Radiobutton__GroupAssignment_1 : ( ruleNAME ) ;
    public final void rule__Radiobutton__GroupAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3058:1: ( ( ruleNAME ) )
            // InternalMyDsl.g:3059:2: ( ruleNAME )
            {
            // InternalMyDsl.g:3059:2: ( ruleNAME )
            // InternalMyDsl.g:3060:3: ruleNAME
            {
             before(grammarAccess.getRadiobuttonAccess().getGroupNAMEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNAME();

            state._fsp--;

             after(grammarAccess.getRadiobuttonAccess().getGroupNAMEParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Radiobutton__GroupAssignment_1"


    // $ANTLR start "rule__Radiobutton__NameAssignment_2"
    // InternalMyDsl.g:3069:1: rule__Radiobutton__NameAssignment_2 : ( ruleNAME ) ;
    public final void rule__Radiobutton__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3073:1: ( ( ruleNAME ) )
            // InternalMyDsl.g:3074:2: ( ruleNAME )
            {
            // InternalMyDsl.g:3074:2: ( ruleNAME )
            // InternalMyDsl.g:3075:3: ruleNAME
            {
             before(grammarAccess.getRadiobuttonAccess().getNameNAMEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNAME();

            state._fsp--;

             after(grammarAccess.getRadiobuttonAccess().getNameNAMEParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Radiobutton__NameAssignment_2"


    // $ANTLR start "rule__Radiobutton__SizeAssignment_3"
    // InternalMyDsl.g:3084:1: rule__Radiobutton__SizeAssignment_3 : ( ruleSize ) ;
    public final void rule__Radiobutton__SizeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3088:1: ( ( ruleSize ) )
            // InternalMyDsl.g:3089:2: ( ruleSize )
            {
            // InternalMyDsl.g:3089:2: ( ruleSize )
            // InternalMyDsl.g:3090:3: ruleSize
            {
             before(grammarAccess.getRadiobuttonAccess().getSizeSizeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSize();

            state._fsp--;

             after(grammarAccess.getRadiobuttonAccess().getSizeSizeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Radiobutton__SizeAssignment_3"


    // $ANTLR start "rule__Radiobutton__CheckedAssignment_4"
    // InternalMyDsl.g:3099:1: rule__Radiobutton__CheckedAssignment_4 : ( ruleCHECKED_YES ) ;
    public final void rule__Radiobutton__CheckedAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3103:1: ( ( ruleCHECKED_YES ) )
            // InternalMyDsl.g:3104:2: ( ruleCHECKED_YES )
            {
            // InternalMyDsl.g:3104:2: ( ruleCHECKED_YES )
            // InternalMyDsl.g:3105:3: ruleCHECKED_YES
            {
             before(grammarAccess.getRadiobuttonAccess().getCheckedCHECKED_YESParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCHECKED_YES();

            state._fsp--;

             after(grammarAccess.getRadiobuttonAccess().getCheckedCHECKED_YESParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Radiobutton__CheckedAssignment_4"


    // $ANTLR start "rule__Radiobutton__TextAssignment_5"
    // InternalMyDsl.g:3114:1: rule__Radiobutton__TextAssignment_5 : ( ruleText ) ;
    public final void rule__Radiobutton__TextAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3118:1: ( ( ruleText ) )
            // InternalMyDsl.g:3119:2: ( ruleText )
            {
            // InternalMyDsl.g:3119:2: ( ruleText )
            // InternalMyDsl.g:3120:3: ruleText
            {
             before(grammarAccess.getRadiobuttonAccess().getTextTextParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getRadiobuttonAccess().getTextTextParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Radiobutton__TextAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000190020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000003E9D0010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000003E990012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000003E990010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000001820L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000860L});

}