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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'X'", "'O'", "'main='", "'frame'", "'container'", "'horizontal'", "'{'", "'}'", "'vertical'", "'positional'", "'['", "']'", "'fixed='", "'space'", "','", "'textfield'", "'label'", "'button'", "'checkbox'", "'radio'"
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
    public static final int T__30=30;
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


    // $ANTLR start "entryRuleFixed"
    // InternalMyDsl.g:328:1: entryRuleFixed : ruleFixed EOF ;
    public final void entryRuleFixed() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleFixed EOF )
            // InternalMyDsl.g:330:1: ruleFixed EOF
            {
             before(grammarAccess.getFixedRule()); 
            pushFollow(FOLLOW_1);
            ruleFixed();

            state._fsp--;

             after(grammarAccess.getFixedRule()); 
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
    // $ANTLR end "entryRuleFixed"


    // $ANTLR start "ruleFixed"
    // InternalMyDsl.g:337:1: ruleFixed : ( ( rule__Fixed__Group__0 ) ) ;
    public final void ruleFixed() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__Fixed__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__Fixed__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__Fixed__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__Fixed__Group__0 )
            {
             before(grammarAccess.getFixedAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__Fixed__Group__0 )
            // InternalMyDsl.g:344:4: rule__Fixed__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Fixed__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFixedAccess().getGroup()); 

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
    // $ANTLR end "ruleFixed"


    // $ANTLR start "entryRuleSpace"
    // InternalMyDsl.g:353:1: entryRuleSpace : ruleSpace EOF ;
    public final void entryRuleSpace() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleSpace EOF )
            // InternalMyDsl.g:355:1: ruleSpace EOF
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
    // InternalMyDsl.g:362:1: ruleSpace : ( ( rule__Space__Group__0 ) ) ;
    public final void ruleSpace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__Space__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__Space__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__Space__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__Space__Group__0 )
            {
             before(grammarAccess.getSpaceAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__Space__Group__0 )
            // InternalMyDsl.g:369:4: rule__Space__Group__0
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
    // InternalMyDsl.g:378:1: entryRulePositionValue : rulePositionValue EOF ;
    public final void entryRulePositionValue() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( rulePositionValue EOF )
            // InternalMyDsl.g:380:1: rulePositionValue EOF
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
    // InternalMyDsl.g:387:1: rulePositionValue : ( ( rule__PositionValue__Group__0 ) ) ;
    public final void rulePositionValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__PositionValue__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__PositionValue__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__PositionValue__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__PositionValue__Group__0 )
            {
             before(grammarAccess.getPositionValueAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__PositionValue__Group__0 )
            // InternalMyDsl.g:394:4: rule__PositionValue__Group__0
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
    // InternalMyDsl.g:403:1: entryRuleSize : ruleSize EOF ;
    public final void entryRuleSize() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleSize EOF )
            // InternalMyDsl.g:405:1: ruleSize EOF
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
    // InternalMyDsl.g:412:1: ruleSize : ( ( rule__Size__Group__0 ) ) ;
    public final void ruleSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__Size__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__Size__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__Size__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__Size__Group__0 )
            {
             before(grammarAccess.getSizeAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__Size__Group__0 )
            // InternalMyDsl.g:419:4: rule__Size__Group__0
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
    // InternalMyDsl.g:428:1: entryRuleGuiElement : ruleGuiElement EOF ;
    public final void entryRuleGuiElement() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleGuiElement EOF )
            // InternalMyDsl.g:430:1: ruleGuiElement EOF
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
    // InternalMyDsl.g:437:1: ruleGuiElement : ( ( rule__GuiElement__Alternatives ) ) ;
    public final void ruleGuiElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__GuiElement__Alternatives ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__GuiElement__Alternatives ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__GuiElement__Alternatives ) )
            // InternalMyDsl.g:443:3: ( rule__GuiElement__Alternatives )
            {
             before(grammarAccess.getGuiElementAccess().getAlternatives()); 
            // InternalMyDsl.g:444:3: ( rule__GuiElement__Alternatives )
            // InternalMyDsl.g:444:4: rule__GuiElement__Alternatives
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
    // InternalMyDsl.g:453:1: entryRuleContainerReference : ruleContainerReference EOF ;
    public final void entryRuleContainerReference() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleContainerReference EOF )
            // InternalMyDsl.g:455:1: ruleContainerReference EOF
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
    // InternalMyDsl.g:462:1: ruleContainerReference : ( ( rule__ContainerReference__Group__0 ) ) ;
    public final void ruleContainerReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__ContainerReference__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__ContainerReference__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__ContainerReference__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__ContainerReference__Group__0 )
            {
             before(grammarAccess.getContainerReferenceAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__ContainerReference__Group__0 )
            // InternalMyDsl.g:469:4: rule__ContainerReference__Group__0
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
    // InternalMyDsl.g:478:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleText EOF )
            // InternalMyDsl.g:480:1: ruleText EOF
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
    // InternalMyDsl.g:487:1: ruleText : ( ( rule__Text__TextAssignment ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__Text__TextAssignment ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__Text__TextAssignment ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__Text__TextAssignment ) )
            // InternalMyDsl.g:493:3: ( rule__Text__TextAssignment )
            {
             before(grammarAccess.getTextAccess().getTextAssignment()); 
            // InternalMyDsl.g:494:3: ( rule__Text__TextAssignment )
            // InternalMyDsl.g:494:4: rule__Text__TextAssignment
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
    // InternalMyDsl.g:503:1: entryRuleTextfield : ruleTextfield EOF ;
    public final void entryRuleTextfield() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleTextfield EOF )
            // InternalMyDsl.g:505:1: ruleTextfield EOF
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
    // InternalMyDsl.g:512:1: ruleTextfield : ( ( rule__Textfield__Group__0 ) ) ;
    public final void ruleTextfield() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__Textfield__Group__0 ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__Textfield__Group__0 ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__Textfield__Group__0 ) )
            // InternalMyDsl.g:518:3: ( rule__Textfield__Group__0 )
            {
             before(grammarAccess.getTextfieldAccess().getGroup()); 
            // InternalMyDsl.g:519:3: ( rule__Textfield__Group__0 )
            // InternalMyDsl.g:519:4: rule__Textfield__Group__0
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
    // InternalMyDsl.g:528:1: entryRuleLabel : ruleLabel EOF ;
    public final void entryRuleLabel() throws RecognitionException {
        try {
            // InternalMyDsl.g:529:1: ( ruleLabel EOF )
            // InternalMyDsl.g:530:1: ruleLabel EOF
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
    // InternalMyDsl.g:537:1: ruleLabel : ( ( rule__Label__Group__0 ) ) ;
    public final void ruleLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:2: ( ( ( rule__Label__Group__0 ) ) )
            // InternalMyDsl.g:542:2: ( ( rule__Label__Group__0 ) )
            {
            // InternalMyDsl.g:542:2: ( ( rule__Label__Group__0 ) )
            // InternalMyDsl.g:543:3: ( rule__Label__Group__0 )
            {
             before(grammarAccess.getLabelAccess().getGroup()); 
            // InternalMyDsl.g:544:3: ( rule__Label__Group__0 )
            // InternalMyDsl.g:544:4: rule__Label__Group__0
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
    // InternalMyDsl.g:553:1: entryRuleButton : ruleButton EOF ;
    public final void entryRuleButton() throws RecognitionException {
        try {
            // InternalMyDsl.g:554:1: ( ruleButton EOF )
            // InternalMyDsl.g:555:1: ruleButton EOF
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
    // InternalMyDsl.g:562:1: ruleButton : ( ( rule__Button__Group__0 ) ) ;
    public final void ruleButton() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:2: ( ( ( rule__Button__Group__0 ) ) )
            // InternalMyDsl.g:567:2: ( ( rule__Button__Group__0 ) )
            {
            // InternalMyDsl.g:567:2: ( ( rule__Button__Group__0 ) )
            // InternalMyDsl.g:568:3: ( rule__Button__Group__0 )
            {
             before(grammarAccess.getButtonAccess().getGroup()); 
            // InternalMyDsl.g:569:3: ( rule__Button__Group__0 )
            // InternalMyDsl.g:569:4: rule__Button__Group__0
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
    // InternalMyDsl.g:578:1: entryRuleCheckbox : ruleCheckbox EOF ;
    public final void entryRuleCheckbox() throws RecognitionException {
        try {
            // InternalMyDsl.g:579:1: ( ruleCheckbox EOF )
            // InternalMyDsl.g:580:1: ruleCheckbox EOF
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
    // InternalMyDsl.g:587:1: ruleCheckbox : ( ( rule__Checkbox__Group__0 ) ) ;
    public final void ruleCheckbox() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:2: ( ( ( rule__Checkbox__Group__0 ) ) )
            // InternalMyDsl.g:592:2: ( ( rule__Checkbox__Group__0 ) )
            {
            // InternalMyDsl.g:592:2: ( ( rule__Checkbox__Group__0 ) )
            // InternalMyDsl.g:593:3: ( rule__Checkbox__Group__0 )
            {
             before(grammarAccess.getCheckboxAccess().getGroup()); 
            // InternalMyDsl.g:594:3: ( rule__Checkbox__Group__0 )
            // InternalMyDsl.g:594:4: rule__Checkbox__Group__0
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
    // InternalMyDsl.g:603:1: entryRuleRadiobutton : ruleRadiobutton EOF ;
    public final void entryRuleRadiobutton() throws RecognitionException {
        try {
            // InternalMyDsl.g:604:1: ( ruleRadiobutton EOF )
            // InternalMyDsl.g:605:1: ruleRadiobutton EOF
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
    // InternalMyDsl.g:612:1: ruleRadiobutton : ( ( rule__Radiobutton__Group__0 ) ) ;
    public final void ruleRadiobutton() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:2: ( ( ( rule__Radiobutton__Group__0 ) ) )
            // InternalMyDsl.g:617:2: ( ( rule__Radiobutton__Group__0 ) )
            {
            // InternalMyDsl.g:617:2: ( ( rule__Radiobutton__Group__0 ) )
            // InternalMyDsl.g:618:3: ( rule__Radiobutton__Group__0 )
            {
             before(grammarAccess.getRadiobuttonAccess().getGroup()); 
            // InternalMyDsl.g:619:3: ( rule__Radiobutton__Group__0 )
            // InternalMyDsl.g:619:4: rule__Radiobutton__Group__0
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
    // InternalMyDsl.g:628:1: entryRuleCHECKED : ruleCHECKED EOF ;
    public final void entryRuleCHECKED() throws RecognitionException {
        try {
            // InternalMyDsl.g:629:1: ( ruleCHECKED EOF )
            // InternalMyDsl.g:630:1: ruleCHECKED EOF
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
    // InternalMyDsl.g:637:1: ruleCHECKED : ( ( rule__CHECKED__Alternatives ) ) ;
    public final void ruleCHECKED() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:641:2: ( ( ( rule__CHECKED__Alternatives ) ) )
            // InternalMyDsl.g:642:2: ( ( rule__CHECKED__Alternatives ) )
            {
            // InternalMyDsl.g:642:2: ( ( rule__CHECKED__Alternatives ) )
            // InternalMyDsl.g:643:3: ( rule__CHECKED__Alternatives )
            {
             before(grammarAccess.getCHECKEDAccess().getAlternatives()); 
            // InternalMyDsl.g:644:3: ( rule__CHECKED__Alternatives )
            // InternalMyDsl.g:644:4: rule__CHECKED__Alternatives
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
    // InternalMyDsl.g:653:1: entryRuleCHECKED_YES : ruleCHECKED_YES EOF ;
    public final void entryRuleCHECKED_YES() throws RecognitionException {
        try {
            // InternalMyDsl.g:654:1: ( ruleCHECKED_YES EOF )
            // InternalMyDsl.g:655:1: ruleCHECKED_YES EOF
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
    // InternalMyDsl.g:662:1: ruleCHECKED_YES : ( 'X' ) ;
    public final void ruleCHECKED_YES() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:666:2: ( ( 'X' ) )
            // InternalMyDsl.g:667:2: ( 'X' )
            {
            // InternalMyDsl.g:667:2: ( 'X' )
            // InternalMyDsl.g:668:3: 'X'
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
    // InternalMyDsl.g:678:1: entryRuleCHECKED_NO : ruleCHECKED_NO EOF ;
    public final void entryRuleCHECKED_NO() throws RecognitionException {
        try {
            // InternalMyDsl.g:679:1: ( ruleCHECKED_NO EOF )
            // InternalMyDsl.g:680:1: ruleCHECKED_NO EOF
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
    // InternalMyDsl.g:687:1: ruleCHECKED_NO : ( 'O' ) ;
    public final void ruleCHECKED_NO() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:691:2: ( ( 'O' ) )
            // InternalMyDsl.g:692:2: ( 'O' )
            {
            // InternalMyDsl.g:692:2: ( 'O' )
            // InternalMyDsl.g:693:3: 'O'
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
    // InternalMyDsl.g:703:1: entryRuleNAME : ruleNAME EOF ;
    public final void entryRuleNAME() throws RecognitionException {
        try {
            // InternalMyDsl.g:704:1: ( ruleNAME EOF )
            // InternalMyDsl.g:705:1: ruleNAME EOF
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
    // InternalMyDsl.g:712:1: ruleNAME : ( RULE_ID ) ;
    public final void ruleNAME() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:716:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:717:2: ( RULE_ID )
            {
            // InternalMyDsl.g:717:2: ( RULE_ID )
            // InternalMyDsl.g:718:3: RULE_ID
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
    // InternalMyDsl.g:727:1: rule__Type__Alternatives : ( ( ruleFrame ) | ( ruleContainer ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:731:1: ( ( ruleFrame ) | ( ruleContainer ) )
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
                    // InternalMyDsl.g:732:2: ( ruleFrame )
                    {
                    // InternalMyDsl.g:732:2: ( ruleFrame )
                    // InternalMyDsl.g:733:3: ruleFrame
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
                    // InternalMyDsl.g:738:2: ( ruleContainer )
                    {
                    // InternalMyDsl.g:738:2: ( ruleContainer )
                    // InternalMyDsl.g:739:3: ruleContainer
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
    // InternalMyDsl.g:748:1: rule__Layout__Alternatives : ( ( ruleLayoutHorizontal ) | ( ruleLayoutVertical ) | ( ruleLayoutPosition ) );
    public final void rule__Layout__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:752:1: ( ( ruleLayoutHorizontal ) | ( ruleLayoutVertical ) | ( ruleLayoutPosition ) )
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
                    // InternalMyDsl.g:753:2: ( ruleLayoutHorizontal )
                    {
                    // InternalMyDsl.g:753:2: ( ruleLayoutHorizontal )
                    // InternalMyDsl.g:754:3: ruleLayoutHorizontal
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
                    // InternalMyDsl.g:759:2: ( ruleLayoutVertical )
                    {
                    // InternalMyDsl.g:759:2: ( ruleLayoutVertical )
                    // InternalMyDsl.g:760:3: ruleLayoutVertical
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
                    // InternalMyDsl.g:765:2: ( ruleLayoutPosition )
                    {
                    // InternalMyDsl.g:765:2: ( ruleLayoutPosition )
                    // InternalMyDsl.g:766:3: ruleLayoutPosition
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
    // InternalMyDsl.g:775:1: rule__LayoutHorizontalEntry__Alternatives : ( ( ( rule__LayoutHorizontalEntry__SpaceAssignment_0 ) ) | ( ( rule__LayoutHorizontalEntry__GuielementAssignment_1 ) ) );
    public final void rule__LayoutHorizontalEntry__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:779:1: ( ( ( rule__LayoutHorizontalEntry__SpaceAssignment_0 ) ) | ( ( rule__LayoutHorizontalEntry__GuielementAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==24) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID||LA3_0==16||(LA3_0>=19 && LA3_0<=20)||(LA3_0>=26 && LA3_0<=30)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:780:2: ( ( rule__LayoutHorizontalEntry__SpaceAssignment_0 ) )
                    {
                    // InternalMyDsl.g:780:2: ( ( rule__LayoutHorizontalEntry__SpaceAssignment_0 ) )
                    // InternalMyDsl.g:781:3: ( rule__LayoutHorizontalEntry__SpaceAssignment_0 )
                    {
                     before(grammarAccess.getLayoutHorizontalEntryAccess().getSpaceAssignment_0()); 
                    // InternalMyDsl.g:782:3: ( rule__LayoutHorizontalEntry__SpaceAssignment_0 )
                    // InternalMyDsl.g:782:4: rule__LayoutHorizontalEntry__SpaceAssignment_0
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
                    // InternalMyDsl.g:786:2: ( ( rule__LayoutHorizontalEntry__GuielementAssignment_1 ) )
                    {
                    // InternalMyDsl.g:786:2: ( ( rule__LayoutHorizontalEntry__GuielementAssignment_1 ) )
                    // InternalMyDsl.g:787:3: ( rule__LayoutHorizontalEntry__GuielementAssignment_1 )
                    {
                     before(grammarAccess.getLayoutHorizontalEntryAccess().getGuielementAssignment_1()); 
                    // InternalMyDsl.g:788:3: ( rule__LayoutHorizontalEntry__GuielementAssignment_1 )
                    // InternalMyDsl.g:788:4: rule__LayoutHorizontalEntry__GuielementAssignment_1
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
    // InternalMyDsl.g:796:1: rule__LayoutVerticalEntry__Alternatives : ( ( ( rule__LayoutVerticalEntry__SpaceAssignment_0 ) ) | ( ( rule__LayoutVerticalEntry__GuielementAssignment_1 ) ) );
    public final void rule__LayoutVerticalEntry__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:800:1: ( ( ( rule__LayoutVerticalEntry__SpaceAssignment_0 ) ) | ( ( rule__LayoutVerticalEntry__GuielementAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==24) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID||LA4_0==16||(LA4_0>=19 && LA4_0<=20)||(LA4_0>=26 && LA4_0<=30)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:801:2: ( ( rule__LayoutVerticalEntry__SpaceAssignment_0 ) )
                    {
                    // InternalMyDsl.g:801:2: ( ( rule__LayoutVerticalEntry__SpaceAssignment_0 ) )
                    // InternalMyDsl.g:802:3: ( rule__LayoutVerticalEntry__SpaceAssignment_0 )
                    {
                     before(grammarAccess.getLayoutVerticalEntryAccess().getSpaceAssignment_0()); 
                    // InternalMyDsl.g:803:3: ( rule__LayoutVerticalEntry__SpaceAssignment_0 )
                    // InternalMyDsl.g:803:4: rule__LayoutVerticalEntry__SpaceAssignment_0
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
                    // InternalMyDsl.g:807:2: ( ( rule__LayoutVerticalEntry__GuielementAssignment_1 ) )
                    {
                    // InternalMyDsl.g:807:2: ( ( rule__LayoutVerticalEntry__GuielementAssignment_1 ) )
                    // InternalMyDsl.g:808:3: ( rule__LayoutVerticalEntry__GuielementAssignment_1 )
                    {
                     before(grammarAccess.getLayoutVerticalEntryAccess().getGuielementAssignment_1()); 
                    // InternalMyDsl.g:809:3: ( rule__LayoutVerticalEntry__GuielementAssignment_1 )
                    // InternalMyDsl.g:809:4: rule__LayoutVerticalEntry__GuielementAssignment_1
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
    // InternalMyDsl.g:817:1: rule__GuiElement__Alternatives : ( ( ruleContainerReference ) | ( ruleLayout ) | ( ruleTextfield ) | ( ruleLabel ) | ( ruleButton ) | ( ruleCheckbox ) | ( ruleRadiobutton ) );
    public final void rule__GuiElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:821:1: ( ( ruleContainerReference ) | ( ruleLayout ) | ( ruleTextfield ) | ( ruleLabel ) | ( ruleButton ) | ( ruleCheckbox ) | ( ruleRadiobutton ) )
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
            case 26:
                {
                alt5=3;
                }
                break;
            case 27:
                {
                alt5=4;
                }
                break;
            case 28:
                {
                alt5=5;
                }
                break;
            case 29:
                {
                alt5=6;
                }
                break;
            case 30:
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
                    // InternalMyDsl.g:822:2: ( ruleContainerReference )
                    {
                    // InternalMyDsl.g:822:2: ( ruleContainerReference )
                    // InternalMyDsl.g:823:3: ruleContainerReference
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
                    // InternalMyDsl.g:828:2: ( ruleLayout )
                    {
                    // InternalMyDsl.g:828:2: ( ruleLayout )
                    // InternalMyDsl.g:829:3: ruleLayout
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
                    // InternalMyDsl.g:834:2: ( ruleTextfield )
                    {
                    // InternalMyDsl.g:834:2: ( ruleTextfield )
                    // InternalMyDsl.g:835:3: ruleTextfield
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
                    // InternalMyDsl.g:840:2: ( ruleLabel )
                    {
                    // InternalMyDsl.g:840:2: ( ruleLabel )
                    // InternalMyDsl.g:841:3: ruleLabel
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
                    // InternalMyDsl.g:846:2: ( ruleButton )
                    {
                    // InternalMyDsl.g:846:2: ( ruleButton )
                    // InternalMyDsl.g:847:3: ruleButton
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
                    // InternalMyDsl.g:852:2: ( ruleCheckbox )
                    {
                    // InternalMyDsl.g:852:2: ( ruleCheckbox )
                    // InternalMyDsl.g:853:3: ruleCheckbox
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
                    // InternalMyDsl.g:858:2: ( ruleRadiobutton )
                    {
                    // InternalMyDsl.g:858:2: ( ruleRadiobutton )
                    // InternalMyDsl.g:859:3: ruleRadiobutton
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
    // InternalMyDsl.g:868:1: rule__CHECKED__Alternatives : ( ( ruleCHECKED_YES ) | ( ruleCHECKED_NO ) );
    public final void rule__CHECKED__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:872:1: ( ( ruleCHECKED_YES ) | ( ruleCHECKED_NO ) )
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
                    // InternalMyDsl.g:873:2: ( ruleCHECKED_YES )
                    {
                    // InternalMyDsl.g:873:2: ( ruleCHECKED_YES )
                    // InternalMyDsl.g:874:3: ruleCHECKED_YES
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
                    // InternalMyDsl.g:879:2: ( ruleCHECKED_NO )
                    {
                    // InternalMyDsl.g:879:2: ( ruleCHECKED_NO )
                    // InternalMyDsl.g:880:3: ruleCHECKED_NO
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
    // InternalMyDsl.g:889:1: rule__Domainmodel__Group__0 : rule__Domainmodel__Group__0__Impl rule__Domainmodel__Group__1 ;
    public final void rule__Domainmodel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:893:1: ( rule__Domainmodel__Group__0__Impl rule__Domainmodel__Group__1 )
            // InternalMyDsl.g:894:2: rule__Domainmodel__Group__0__Impl rule__Domainmodel__Group__1
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
    // InternalMyDsl.g:901:1: rule__Domainmodel__Group__0__Impl : ( 'main=' ) ;
    public final void rule__Domainmodel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:905:1: ( ( 'main=' ) )
            // InternalMyDsl.g:906:1: ( 'main=' )
            {
            // InternalMyDsl.g:906:1: ( 'main=' )
            // InternalMyDsl.g:907:2: 'main='
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
    // InternalMyDsl.g:916:1: rule__Domainmodel__Group__1 : rule__Domainmodel__Group__1__Impl rule__Domainmodel__Group__2 ;
    public final void rule__Domainmodel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:920:1: ( rule__Domainmodel__Group__1__Impl rule__Domainmodel__Group__2 )
            // InternalMyDsl.g:921:2: rule__Domainmodel__Group__1__Impl rule__Domainmodel__Group__2
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
    // InternalMyDsl.g:928:1: rule__Domainmodel__Group__1__Impl : ( ( rule__Domainmodel__MainAssignment_1 ) ) ;
    public final void rule__Domainmodel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:932:1: ( ( ( rule__Domainmodel__MainAssignment_1 ) ) )
            // InternalMyDsl.g:933:1: ( ( rule__Domainmodel__MainAssignment_1 ) )
            {
            // InternalMyDsl.g:933:1: ( ( rule__Domainmodel__MainAssignment_1 ) )
            // InternalMyDsl.g:934:2: ( rule__Domainmodel__MainAssignment_1 )
            {
             before(grammarAccess.getDomainmodelAccess().getMainAssignment_1()); 
            // InternalMyDsl.g:935:2: ( rule__Domainmodel__MainAssignment_1 )
            // InternalMyDsl.g:935:3: rule__Domainmodel__MainAssignment_1
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
    // InternalMyDsl.g:943:1: rule__Domainmodel__Group__2 : rule__Domainmodel__Group__2__Impl ;
    public final void rule__Domainmodel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:947:1: ( rule__Domainmodel__Group__2__Impl )
            // InternalMyDsl.g:948:2: rule__Domainmodel__Group__2__Impl
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
    // InternalMyDsl.g:954:1: rule__Domainmodel__Group__2__Impl : ( ( rule__Domainmodel__ElementsAssignment_2 )* ) ;
    public final void rule__Domainmodel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:958:1: ( ( ( rule__Domainmodel__ElementsAssignment_2 )* ) )
            // InternalMyDsl.g:959:1: ( ( rule__Domainmodel__ElementsAssignment_2 )* )
            {
            // InternalMyDsl.g:959:1: ( ( rule__Domainmodel__ElementsAssignment_2 )* )
            // InternalMyDsl.g:960:2: ( rule__Domainmodel__ElementsAssignment_2 )*
            {
             before(grammarAccess.getDomainmodelAccess().getElementsAssignment_2()); 
            // InternalMyDsl.g:961:2: ( rule__Domainmodel__ElementsAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=14 && LA7_0<=15)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:961:3: rule__Domainmodel__ElementsAssignment_2
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
    // InternalMyDsl.g:970:1: rule__Frame__Group__0 : rule__Frame__Group__0__Impl rule__Frame__Group__1 ;
    public final void rule__Frame__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:974:1: ( rule__Frame__Group__0__Impl rule__Frame__Group__1 )
            // InternalMyDsl.g:975:2: rule__Frame__Group__0__Impl rule__Frame__Group__1
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
    // InternalMyDsl.g:982:1: rule__Frame__Group__0__Impl : ( 'frame' ) ;
    public final void rule__Frame__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:986:1: ( ( 'frame' ) )
            // InternalMyDsl.g:987:1: ( 'frame' )
            {
            // InternalMyDsl.g:987:1: ( 'frame' )
            // InternalMyDsl.g:988:2: 'frame'
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
    // InternalMyDsl.g:997:1: rule__Frame__Group__1 : rule__Frame__Group__1__Impl rule__Frame__Group__2 ;
    public final void rule__Frame__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1001:1: ( rule__Frame__Group__1__Impl rule__Frame__Group__2 )
            // InternalMyDsl.g:1002:2: rule__Frame__Group__1__Impl rule__Frame__Group__2
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
    // InternalMyDsl.g:1009:1: rule__Frame__Group__1__Impl : ( ( rule__Frame__NameAssignment_1 ) ) ;
    public final void rule__Frame__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1013:1: ( ( ( rule__Frame__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1014:1: ( ( rule__Frame__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1014:1: ( ( rule__Frame__NameAssignment_1 ) )
            // InternalMyDsl.g:1015:2: ( rule__Frame__NameAssignment_1 )
            {
             before(grammarAccess.getFrameAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1016:2: ( rule__Frame__NameAssignment_1 )
            // InternalMyDsl.g:1016:3: rule__Frame__NameAssignment_1
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
    // InternalMyDsl.g:1024:1: rule__Frame__Group__2 : rule__Frame__Group__2__Impl rule__Frame__Group__3 ;
    public final void rule__Frame__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1028:1: ( rule__Frame__Group__2__Impl rule__Frame__Group__3 )
            // InternalMyDsl.g:1029:2: rule__Frame__Group__2__Impl rule__Frame__Group__3
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
    // InternalMyDsl.g:1036:1: rule__Frame__Group__2__Impl : ( ( rule__Frame__SizeAssignment_2 )? ) ;
    public final void rule__Frame__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1040:1: ( ( ( rule__Frame__SizeAssignment_2 )? ) )
            // InternalMyDsl.g:1041:1: ( ( rule__Frame__SizeAssignment_2 )? )
            {
            // InternalMyDsl.g:1041:1: ( ( rule__Frame__SizeAssignment_2 )? )
            // InternalMyDsl.g:1042:2: ( rule__Frame__SizeAssignment_2 )?
            {
             before(grammarAccess.getFrameAccess().getSizeAssignment_2()); 
            // InternalMyDsl.g:1043:2: ( rule__Frame__SizeAssignment_2 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:1043:3: rule__Frame__SizeAssignment_2
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
    // InternalMyDsl.g:1051:1: rule__Frame__Group__3 : rule__Frame__Group__3__Impl ;
    public final void rule__Frame__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1055:1: ( rule__Frame__Group__3__Impl )
            // InternalMyDsl.g:1056:2: rule__Frame__Group__3__Impl
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
    // InternalMyDsl.g:1062:1: rule__Frame__Group__3__Impl : ( ( rule__Frame__LayoutAssignment_3 )? ) ;
    public final void rule__Frame__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1066:1: ( ( ( rule__Frame__LayoutAssignment_3 )? ) )
            // InternalMyDsl.g:1067:1: ( ( rule__Frame__LayoutAssignment_3 )? )
            {
            // InternalMyDsl.g:1067:1: ( ( rule__Frame__LayoutAssignment_3 )? )
            // InternalMyDsl.g:1068:2: ( rule__Frame__LayoutAssignment_3 )?
            {
             before(grammarAccess.getFrameAccess().getLayoutAssignment_3()); 
            // InternalMyDsl.g:1069:2: ( rule__Frame__LayoutAssignment_3 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16||(LA9_0>=19 && LA9_0<=20)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1069:3: rule__Frame__LayoutAssignment_3
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
    // InternalMyDsl.g:1078:1: rule__Container__Group__0 : rule__Container__Group__0__Impl rule__Container__Group__1 ;
    public final void rule__Container__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1082:1: ( rule__Container__Group__0__Impl rule__Container__Group__1 )
            // InternalMyDsl.g:1083:2: rule__Container__Group__0__Impl rule__Container__Group__1
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
    // InternalMyDsl.g:1090:1: rule__Container__Group__0__Impl : ( 'container' ) ;
    public final void rule__Container__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1094:1: ( ( 'container' ) )
            // InternalMyDsl.g:1095:1: ( 'container' )
            {
            // InternalMyDsl.g:1095:1: ( 'container' )
            // InternalMyDsl.g:1096:2: 'container'
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
    // InternalMyDsl.g:1105:1: rule__Container__Group__1 : rule__Container__Group__1__Impl rule__Container__Group__2 ;
    public final void rule__Container__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1109:1: ( rule__Container__Group__1__Impl rule__Container__Group__2 )
            // InternalMyDsl.g:1110:2: rule__Container__Group__1__Impl rule__Container__Group__2
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
    // InternalMyDsl.g:1117:1: rule__Container__Group__1__Impl : ( ( rule__Container__NameAssignment_1 ) ) ;
    public final void rule__Container__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1121:1: ( ( ( rule__Container__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1122:1: ( ( rule__Container__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1122:1: ( ( rule__Container__NameAssignment_1 ) )
            // InternalMyDsl.g:1123:2: ( rule__Container__NameAssignment_1 )
            {
             before(grammarAccess.getContainerAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1124:2: ( rule__Container__NameAssignment_1 )
            // InternalMyDsl.g:1124:3: rule__Container__NameAssignment_1
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
    // InternalMyDsl.g:1132:1: rule__Container__Group__2 : rule__Container__Group__2__Impl rule__Container__Group__3 ;
    public final void rule__Container__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1136:1: ( rule__Container__Group__2__Impl rule__Container__Group__3 )
            // InternalMyDsl.g:1137:2: rule__Container__Group__2__Impl rule__Container__Group__3
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
    // InternalMyDsl.g:1144:1: rule__Container__Group__2__Impl : ( ( rule__Container__SizeAssignment_2 )? ) ;
    public final void rule__Container__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1148:1: ( ( ( rule__Container__SizeAssignment_2 )? ) )
            // InternalMyDsl.g:1149:1: ( ( rule__Container__SizeAssignment_2 )? )
            {
            // InternalMyDsl.g:1149:1: ( ( rule__Container__SizeAssignment_2 )? )
            // InternalMyDsl.g:1150:2: ( rule__Container__SizeAssignment_2 )?
            {
             before(grammarAccess.getContainerAccess().getSizeAssignment_2()); 
            // InternalMyDsl.g:1151:2: ( rule__Container__SizeAssignment_2 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1151:3: rule__Container__SizeAssignment_2
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
    // InternalMyDsl.g:1159:1: rule__Container__Group__3 : rule__Container__Group__3__Impl ;
    public final void rule__Container__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1163:1: ( rule__Container__Group__3__Impl )
            // InternalMyDsl.g:1164:2: rule__Container__Group__3__Impl
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
    // InternalMyDsl.g:1170:1: rule__Container__Group__3__Impl : ( ( rule__Container__LayoutAssignment_3 ) ) ;
    public final void rule__Container__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1174:1: ( ( ( rule__Container__LayoutAssignment_3 ) ) )
            // InternalMyDsl.g:1175:1: ( ( rule__Container__LayoutAssignment_3 ) )
            {
            // InternalMyDsl.g:1175:1: ( ( rule__Container__LayoutAssignment_3 ) )
            // InternalMyDsl.g:1176:2: ( rule__Container__LayoutAssignment_3 )
            {
             before(grammarAccess.getContainerAccess().getLayoutAssignment_3()); 
            // InternalMyDsl.g:1177:2: ( rule__Container__LayoutAssignment_3 )
            // InternalMyDsl.g:1177:3: rule__Container__LayoutAssignment_3
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
    // InternalMyDsl.g:1186:1: rule__LayoutHorizontal__Group__0 : rule__LayoutHorizontal__Group__0__Impl rule__LayoutHorizontal__Group__1 ;
    public final void rule__LayoutHorizontal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1190:1: ( rule__LayoutHorizontal__Group__0__Impl rule__LayoutHorizontal__Group__1 )
            // InternalMyDsl.g:1191:2: rule__LayoutHorizontal__Group__0__Impl rule__LayoutHorizontal__Group__1
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
    // InternalMyDsl.g:1198:1: rule__LayoutHorizontal__Group__0__Impl : ( 'horizontal' ) ;
    public final void rule__LayoutHorizontal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1202:1: ( ( 'horizontal' ) )
            // InternalMyDsl.g:1203:1: ( 'horizontal' )
            {
            // InternalMyDsl.g:1203:1: ( 'horizontal' )
            // InternalMyDsl.g:1204:2: 'horizontal'
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
    // InternalMyDsl.g:1213:1: rule__LayoutHorizontal__Group__1 : rule__LayoutHorizontal__Group__1__Impl rule__LayoutHorizontal__Group__2 ;
    public final void rule__LayoutHorizontal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1217:1: ( rule__LayoutHorizontal__Group__1__Impl rule__LayoutHorizontal__Group__2 )
            // InternalMyDsl.g:1218:2: rule__LayoutHorizontal__Group__1__Impl rule__LayoutHorizontal__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:1225:1: rule__LayoutHorizontal__Group__1__Impl : ( ( rule__LayoutHorizontal__FixedAssignment_1 )? ) ;
    public final void rule__LayoutHorizontal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1229:1: ( ( ( rule__LayoutHorizontal__FixedAssignment_1 )? ) )
            // InternalMyDsl.g:1230:1: ( ( rule__LayoutHorizontal__FixedAssignment_1 )? )
            {
            // InternalMyDsl.g:1230:1: ( ( rule__LayoutHorizontal__FixedAssignment_1 )? )
            // InternalMyDsl.g:1231:2: ( rule__LayoutHorizontal__FixedAssignment_1 )?
            {
             before(grammarAccess.getLayoutHorizontalAccess().getFixedAssignment_1()); 
            // InternalMyDsl.g:1232:2: ( rule__LayoutHorizontal__FixedAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1232:3: rule__LayoutHorizontal__FixedAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__LayoutHorizontal__FixedAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLayoutHorizontalAccess().getFixedAssignment_1()); 

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
    // InternalMyDsl.g:1240:1: rule__LayoutHorizontal__Group__2 : rule__LayoutHorizontal__Group__2__Impl rule__LayoutHorizontal__Group__3 ;
    public final void rule__LayoutHorizontal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1244:1: ( rule__LayoutHorizontal__Group__2__Impl rule__LayoutHorizontal__Group__3 )
            // InternalMyDsl.g:1245:2: rule__LayoutHorizontal__Group__2__Impl rule__LayoutHorizontal__Group__3
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
    // InternalMyDsl.g:1252:1: rule__LayoutHorizontal__Group__2__Impl : ( '{' ) ;
    public final void rule__LayoutHorizontal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1256:1: ( ( '{' ) )
            // InternalMyDsl.g:1257:1: ( '{' )
            {
            // InternalMyDsl.g:1257:1: ( '{' )
            // InternalMyDsl.g:1258:2: '{'
            {
             before(grammarAccess.getLayoutHorizontalAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLayoutHorizontalAccess().getLeftCurlyBracketKeyword_2()); 

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
    // InternalMyDsl.g:1267:1: rule__LayoutHorizontal__Group__3 : rule__LayoutHorizontal__Group__3__Impl rule__LayoutHorizontal__Group__4 ;
    public final void rule__LayoutHorizontal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1271:1: ( rule__LayoutHorizontal__Group__3__Impl rule__LayoutHorizontal__Group__4 )
            // InternalMyDsl.g:1272:2: rule__LayoutHorizontal__Group__3__Impl rule__LayoutHorizontal__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__LayoutHorizontal__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayoutHorizontal__Group__4();

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
    // InternalMyDsl.g:1279:1: rule__LayoutHorizontal__Group__3__Impl : ( ( rule__LayoutHorizontal__EntriesAssignment_3 )* ) ;
    public final void rule__LayoutHorizontal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1283:1: ( ( ( rule__LayoutHorizontal__EntriesAssignment_3 )* ) )
            // InternalMyDsl.g:1284:1: ( ( rule__LayoutHorizontal__EntriesAssignment_3 )* )
            {
            // InternalMyDsl.g:1284:1: ( ( rule__LayoutHorizontal__EntriesAssignment_3 )* )
            // InternalMyDsl.g:1285:2: ( rule__LayoutHorizontal__EntriesAssignment_3 )*
            {
             before(grammarAccess.getLayoutHorizontalAccess().getEntriesAssignment_3()); 
            // InternalMyDsl.g:1286:2: ( rule__LayoutHorizontal__EntriesAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||LA12_0==16||(LA12_0>=19 && LA12_0<=20)||LA12_0==24||(LA12_0>=26 && LA12_0<=30)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1286:3: rule__LayoutHorizontal__EntriesAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__LayoutHorizontal__EntriesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getLayoutHorizontalAccess().getEntriesAssignment_3()); 

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


    // $ANTLR start "rule__LayoutHorizontal__Group__4"
    // InternalMyDsl.g:1294:1: rule__LayoutHorizontal__Group__4 : rule__LayoutHorizontal__Group__4__Impl ;
    public final void rule__LayoutHorizontal__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1298:1: ( rule__LayoutHorizontal__Group__4__Impl )
            // InternalMyDsl.g:1299:2: rule__LayoutHorizontal__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LayoutHorizontal__Group__4__Impl();

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
    // $ANTLR end "rule__LayoutHorizontal__Group__4"


    // $ANTLR start "rule__LayoutHorizontal__Group__4__Impl"
    // InternalMyDsl.g:1305:1: rule__LayoutHorizontal__Group__4__Impl : ( '}' ) ;
    public final void rule__LayoutHorizontal__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1309:1: ( ( '}' ) )
            // InternalMyDsl.g:1310:1: ( '}' )
            {
            // InternalMyDsl.g:1310:1: ( '}' )
            // InternalMyDsl.g:1311:2: '}'
            {
             before(grammarAccess.getLayoutHorizontalAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLayoutHorizontalAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__LayoutHorizontal__Group__4__Impl"


    // $ANTLR start "rule__LayoutVertical__Group__0"
    // InternalMyDsl.g:1321:1: rule__LayoutVertical__Group__0 : rule__LayoutVertical__Group__0__Impl rule__LayoutVertical__Group__1 ;
    public final void rule__LayoutVertical__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1325:1: ( rule__LayoutVertical__Group__0__Impl rule__LayoutVertical__Group__1 )
            // InternalMyDsl.g:1326:2: rule__LayoutVertical__Group__0__Impl rule__LayoutVertical__Group__1
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
    // InternalMyDsl.g:1333:1: rule__LayoutVertical__Group__0__Impl : ( 'vertical' ) ;
    public final void rule__LayoutVertical__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1337:1: ( ( 'vertical' ) )
            // InternalMyDsl.g:1338:1: ( 'vertical' )
            {
            // InternalMyDsl.g:1338:1: ( 'vertical' )
            // InternalMyDsl.g:1339:2: 'vertical'
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
    // InternalMyDsl.g:1348:1: rule__LayoutVertical__Group__1 : rule__LayoutVertical__Group__1__Impl rule__LayoutVertical__Group__2 ;
    public final void rule__LayoutVertical__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1352:1: ( rule__LayoutVertical__Group__1__Impl rule__LayoutVertical__Group__2 )
            // InternalMyDsl.g:1353:2: rule__LayoutVertical__Group__1__Impl rule__LayoutVertical__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:1360:1: rule__LayoutVertical__Group__1__Impl : ( ( rule__LayoutVertical__FixedAssignment_1 )? ) ;
    public final void rule__LayoutVertical__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1364:1: ( ( ( rule__LayoutVertical__FixedAssignment_1 )? ) )
            // InternalMyDsl.g:1365:1: ( ( rule__LayoutVertical__FixedAssignment_1 )? )
            {
            // InternalMyDsl.g:1365:1: ( ( rule__LayoutVertical__FixedAssignment_1 )? )
            // InternalMyDsl.g:1366:2: ( rule__LayoutVertical__FixedAssignment_1 )?
            {
             before(grammarAccess.getLayoutVerticalAccess().getFixedAssignment_1()); 
            // InternalMyDsl.g:1367:2: ( rule__LayoutVertical__FixedAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1367:3: rule__LayoutVertical__FixedAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__LayoutVertical__FixedAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLayoutVerticalAccess().getFixedAssignment_1()); 

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
    // InternalMyDsl.g:1375:1: rule__LayoutVertical__Group__2 : rule__LayoutVertical__Group__2__Impl rule__LayoutVertical__Group__3 ;
    public final void rule__LayoutVertical__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1379:1: ( rule__LayoutVertical__Group__2__Impl rule__LayoutVertical__Group__3 )
            // InternalMyDsl.g:1380:2: rule__LayoutVertical__Group__2__Impl rule__LayoutVertical__Group__3
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
    // InternalMyDsl.g:1387:1: rule__LayoutVertical__Group__2__Impl : ( '{' ) ;
    public final void rule__LayoutVertical__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1391:1: ( ( '{' ) )
            // InternalMyDsl.g:1392:1: ( '{' )
            {
            // InternalMyDsl.g:1392:1: ( '{' )
            // InternalMyDsl.g:1393:2: '{'
            {
             before(grammarAccess.getLayoutVerticalAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLayoutVerticalAccess().getLeftCurlyBracketKeyword_2()); 

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
    // InternalMyDsl.g:1402:1: rule__LayoutVertical__Group__3 : rule__LayoutVertical__Group__3__Impl rule__LayoutVertical__Group__4 ;
    public final void rule__LayoutVertical__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1406:1: ( rule__LayoutVertical__Group__3__Impl rule__LayoutVertical__Group__4 )
            // InternalMyDsl.g:1407:2: rule__LayoutVertical__Group__3__Impl rule__LayoutVertical__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__LayoutVertical__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayoutVertical__Group__4();

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
    // InternalMyDsl.g:1414:1: rule__LayoutVertical__Group__3__Impl : ( ( rule__LayoutVertical__EntriesAssignment_3 )* ) ;
    public final void rule__LayoutVertical__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1418:1: ( ( ( rule__LayoutVertical__EntriesAssignment_3 )* ) )
            // InternalMyDsl.g:1419:1: ( ( rule__LayoutVertical__EntriesAssignment_3 )* )
            {
            // InternalMyDsl.g:1419:1: ( ( rule__LayoutVertical__EntriesAssignment_3 )* )
            // InternalMyDsl.g:1420:2: ( rule__LayoutVertical__EntriesAssignment_3 )*
            {
             before(grammarAccess.getLayoutVerticalAccess().getEntriesAssignment_3()); 
            // InternalMyDsl.g:1421:2: ( rule__LayoutVertical__EntriesAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==16||(LA14_0>=19 && LA14_0<=20)||LA14_0==24||(LA14_0>=26 && LA14_0<=30)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:1421:3: rule__LayoutVertical__EntriesAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__LayoutVertical__EntriesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getLayoutVerticalAccess().getEntriesAssignment_3()); 

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


    // $ANTLR start "rule__LayoutVertical__Group__4"
    // InternalMyDsl.g:1429:1: rule__LayoutVertical__Group__4 : rule__LayoutVertical__Group__4__Impl ;
    public final void rule__LayoutVertical__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1433:1: ( rule__LayoutVertical__Group__4__Impl )
            // InternalMyDsl.g:1434:2: rule__LayoutVertical__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LayoutVertical__Group__4__Impl();

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
    // $ANTLR end "rule__LayoutVertical__Group__4"


    // $ANTLR start "rule__LayoutVertical__Group__4__Impl"
    // InternalMyDsl.g:1440:1: rule__LayoutVertical__Group__4__Impl : ( '}' ) ;
    public final void rule__LayoutVertical__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1444:1: ( ( '}' ) )
            // InternalMyDsl.g:1445:1: ( '}' )
            {
            // InternalMyDsl.g:1445:1: ( '}' )
            // InternalMyDsl.g:1446:2: '}'
            {
             before(grammarAccess.getLayoutVerticalAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLayoutVerticalAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__LayoutVertical__Group__4__Impl"


    // $ANTLR start "rule__LayoutPosition__Group__0"
    // InternalMyDsl.g:1456:1: rule__LayoutPosition__Group__0 : rule__LayoutPosition__Group__0__Impl rule__LayoutPosition__Group__1 ;
    public final void rule__LayoutPosition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1460:1: ( rule__LayoutPosition__Group__0__Impl rule__LayoutPosition__Group__1 )
            // InternalMyDsl.g:1461:2: rule__LayoutPosition__Group__0__Impl rule__LayoutPosition__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:1468:1: rule__LayoutPosition__Group__0__Impl : ( 'positional' ) ;
    public final void rule__LayoutPosition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1472:1: ( ( 'positional' ) )
            // InternalMyDsl.g:1473:1: ( 'positional' )
            {
            // InternalMyDsl.g:1473:1: ( 'positional' )
            // InternalMyDsl.g:1474:2: 'positional'
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
    // InternalMyDsl.g:1483:1: rule__LayoutPosition__Group__1 : rule__LayoutPosition__Group__1__Impl rule__LayoutPosition__Group__2 ;
    public final void rule__LayoutPosition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1487:1: ( rule__LayoutPosition__Group__1__Impl rule__LayoutPosition__Group__2 )
            // InternalMyDsl.g:1488:2: rule__LayoutPosition__Group__1__Impl rule__LayoutPosition__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:1495:1: rule__LayoutPosition__Group__1__Impl : ( '{' ) ;
    public final void rule__LayoutPosition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1499:1: ( ( '{' ) )
            // InternalMyDsl.g:1500:1: ( '{' )
            {
            // InternalMyDsl.g:1500:1: ( '{' )
            // InternalMyDsl.g:1501:2: '{'
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
    // InternalMyDsl.g:1510:1: rule__LayoutPosition__Group__2 : rule__LayoutPosition__Group__2__Impl rule__LayoutPosition__Group__3 ;
    public final void rule__LayoutPosition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1514:1: ( rule__LayoutPosition__Group__2__Impl rule__LayoutPosition__Group__3 )
            // InternalMyDsl.g:1515:2: rule__LayoutPosition__Group__2__Impl rule__LayoutPosition__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:1522:1: rule__LayoutPosition__Group__2__Impl : ( ( rule__LayoutPosition__EntriesAssignment_2 )* ) ;
    public final void rule__LayoutPosition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1526:1: ( ( ( rule__LayoutPosition__EntriesAssignment_2 )* ) )
            // InternalMyDsl.g:1527:1: ( ( rule__LayoutPosition__EntriesAssignment_2 )* )
            {
            // InternalMyDsl.g:1527:1: ( ( rule__LayoutPosition__EntriesAssignment_2 )* )
            // InternalMyDsl.g:1528:2: ( rule__LayoutPosition__EntriesAssignment_2 )*
            {
             before(grammarAccess.getLayoutPositionAccess().getEntriesAssignment_2()); 
            // InternalMyDsl.g:1529:2: ( rule__LayoutPosition__EntriesAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==21) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:1529:3: rule__LayoutPosition__EntriesAssignment_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__LayoutPosition__EntriesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalMyDsl.g:1537:1: rule__LayoutPosition__Group__3 : rule__LayoutPosition__Group__3__Impl ;
    public final void rule__LayoutPosition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1541:1: ( rule__LayoutPosition__Group__3__Impl )
            // InternalMyDsl.g:1542:2: rule__LayoutPosition__Group__3__Impl
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
    // InternalMyDsl.g:1548:1: rule__LayoutPosition__Group__3__Impl : ( '}' ) ;
    public final void rule__LayoutPosition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1552:1: ( ( '}' ) )
            // InternalMyDsl.g:1553:1: ( '}' )
            {
            // InternalMyDsl.g:1553:1: ( '}' )
            // InternalMyDsl.g:1554:2: '}'
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
    // InternalMyDsl.g:1564:1: rule__LayoutPositionEntry__Group__0 : rule__LayoutPositionEntry__Group__0__Impl rule__LayoutPositionEntry__Group__1 ;
    public final void rule__LayoutPositionEntry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1568:1: ( rule__LayoutPositionEntry__Group__0__Impl rule__LayoutPositionEntry__Group__1 )
            // InternalMyDsl.g:1569:2: rule__LayoutPositionEntry__Group__0__Impl rule__LayoutPositionEntry__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:1576:1: rule__LayoutPositionEntry__Group__0__Impl : ( '[' ) ;
    public final void rule__LayoutPositionEntry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1580:1: ( ( '[' ) )
            // InternalMyDsl.g:1581:1: ( '[' )
            {
            // InternalMyDsl.g:1581:1: ( '[' )
            // InternalMyDsl.g:1582:2: '['
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
    // InternalMyDsl.g:1591:1: rule__LayoutPositionEntry__Group__1 : rule__LayoutPositionEntry__Group__1__Impl rule__LayoutPositionEntry__Group__2 ;
    public final void rule__LayoutPositionEntry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1595:1: ( rule__LayoutPositionEntry__Group__1__Impl rule__LayoutPositionEntry__Group__2 )
            // InternalMyDsl.g:1596:2: rule__LayoutPositionEntry__Group__1__Impl rule__LayoutPositionEntry__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:1603:1: rule__LayoutPositionEntry__Group__1__Impl : ( ( rule__LayoutPositionEntry__PositionAssignment_1 ) ) ;
    public final void rule__LayoutPositionEntry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1607:1: ( ( ( rule__LayoutPositionEntry__PositionAssignment_1 ) ) )
            // InternalMyDsl.g:1608:1: ( ( rule__LayoutPositionEntry__PositionAssignment_1 ) )
            {
            // InternalMyDsl.g:1608:1: ( ( rule__LayoutPositionEntry__PositionAssignment_1 ) )
            // InternalMyDsl.g:1609:2: ( rule__LayoutPositionEntry__PositionAssignment_1 )
            {
             before(grammarAccess.getLayoutPositionEntryAccess().getPositionAssignment_1()); 
            // InternalMyDsl.g:1610:2: ( rule__LayoutPositionEntry__PositionAssignment_1 )
            // InternalMyDsl.g:1610:3: rule__LayoutPositionEntry__PositionAssignment_1
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
    // InternalMyDsl.g:1618:1: rule__LayoutPositionEntry__Group__2 : rule__LayoutPositionEntry__Group__2__Impl rule__LayoutPositionEntry__Group__3 ;
    public final void rule__LayoutPositionEntry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1622:1: ( rule__LayoutPositionEntry__Group__2__Impl rule__LayoutPositionEntry__Group__3 )
            // InternalMyDsl.g:1623:2: rule__LayoutPositionEntry__Group__2__Impl rule__LayoutPositionEntry__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:1630:1: rule__LayoutPositionEntry__Group__2__Impl : ( ']' ) ;
    public final void rule__LayoutPositionEntry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1634:1: ( ( ']' ) )
            // InternalMyDsl.g:1635:1: ( ']' )
            {
            // InternalMyDsl.g:1635:1: ( ']' )
            // InternalMyDsl.g:1636:2: ']'
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
    // InternalMyDsl.g:1645:1: rule__LayoutPositionEntry__Group__3 : rule__LayoutPositionEntry__Group__3__Impl ;
    public final void rule__LayoutPositionEntry__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1649:1: ( rule__LayoutPositionEntry__Group__3__Impl )
            // InternalMyDsl.g:1650:2: rule__LayoutPositionEntry__Group__3__Impl
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
    // InternalMyDsl.g:1656:1: rule__LayoutPositionEntry__Group__3__Impl : ( ( rule__LayoutPositionEntry__GuielementAssignment_3 ) ) ;
    public final void rule__LayoutPositionEntry__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1660:1: ( ( ( rule__LayoutPositionEntry__GuielementAssignment_3 ) ) )
            // InternalMyDsl.g:1661:1: ( ( rule__LayoutPositionEntry__GuielementAssignment_3 ) )
            {
            // InternalMyDsl.g:1661:1: ( ( rule__LayoutPositionEntry__GuielementAssignment_3 ) )
            // InternalMyDsl.g:1662:2: ( rule__LayoutPositionEntry__GuielementAssignment_3 )
            {
             before(grammarAccess.getLayoutPositionEntryAccess().getGuielementAssignment_3()); 
            // InternalMyDsl.g:1663:2: ( rule__LayoutPositionEntry__GuielementAssignment_3 )
            // InternalMyDsl.g:1663:3: rule__LayoutPositionEntry__GuielementAssignment_3
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


    // $ANTLR start "rule__Fixed__Group__0"
    // InternalMyDsl.g:1672:1: rule__Fixed__Group__0 : rule__Fixed__Group__0__Impl rule__Fixed__Group__1 ;
    public final void rule__Fixed__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1676:1: ( rule__Fixed__Group__0__Impl rule__Fixed__Group__1 )
            // InternalMyDsl.g:1677:2: rule__Fixed__Group__0__Impl rule__Fixed__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Fixed__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fixed__Group__1();

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
    // $ANTLR end "rule__Fixed__Group__0"


    // $ANTLR start "rule__Fixed__Group__0__Impl"
    // InternalMyDsl.g:1684:1: rule__Fixed__Group__0__Impl : ( 'fixed=' ) ;
    public final void rule__Fixed__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1688:1: ( ( 'fixed=' ) )
            // InternalMyDsl.g:1689:1: ( 'fixed=' )
            {
            // InternalMyDsl.g:1689:1: ( 'fixed=' )
            // InternalMyDsl.g:1690:2: 'fixed='
            {
             before(grammarAccess.getFixedAccess().getFixedKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getFixedAccess().getFixedKeyword_0()); 

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
    // $ANTLR end "rule__Fixed__Group__0__Impl"


    // $ANTLR start "rule__Fixed__Group__1"
    // InternalMyDsl.g:1699:1: rule__Fixed__Group__1 : rule__Fixed__Group__1__Impl ;
    public final void rule__Fixed__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1703:1: ( rule__Fixed__Group__1__Impl )
            // InternalMyDsl.g:1704:2: rule__Fixed__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fixed__Group__1__Impl();

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
    // $ANTLR end "rule__Fixed__Group__1"


    // $ANTLR start "rule__Fixed__Group__1__Impl"
    // InternalMyDsl.g:1710:1: rule__Fixed__Group__1__Impl : ( ( rule__Fixed__FixedAssignment_1 ) ) ;
    public final void rule__Fixed__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1714:1: ( ( ( rule__Fixed__FixedAssignment_1 ) ) )
            // InternalMyDsl.g:1715:1: ( ( rule__Fixed__FixedAssignment_1 ) )
            {
            // InternalMyDsl.g:1715:1: ( ( rule__Fixed__FixedAssignment_1 ) )
            // InternalMyDsl.g:1716:2: ( rule__Fixed__FixedAssignment_1 )
            {
             before(grammarAccess.getFixedAccess().getFixedAssignment_1()); 
            // InternalMyDsl.g:1717:2: ( rule__Fixed__FixedAssignment_1 )
            // InternalMyDsl.g:1717:3: rule__Fixed__FixedAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Fixed__FixedAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFixedAccess().getFixedAssignment_1()); 

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
    // $ANTLR end "rule__Fixed__Group__1__Impl"


    // $ANTLR start "rule__Space__Group__0"
    // InternalMyDsl.g:1726:1: rule__Space__Group__0 : rule__Space__Group__0__Impl rule__Space__Group__1 ;
    public final void rule__Space__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1730:1: ( rule__Space__Group__0__Impl rule__Space__Group__1 )
            // InternalMyDsl.g:1731:2: rule__Space__Group__0__Impl rule__Space__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:1738:1: rule__Space__Group__0__Impl : ( 'space' ) ;
    public final void rule__Space__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1742:1: ( ( 'space' ) )
            // InternalMyDsl.g:1743:1: ( 'space' )
            {
            // InternalMyDsl.g:1743:1: ( 'space' )
            // InternalMyDsl.g:1744:2: 'space'
            {
             before(grammarAccess.getSpaceAccess().getSpaceKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyDsl.g:1753:1: rule__Space__Group__1 : rule__Space__Group__1__Impl ;
    public final void rule__Space__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1757:1: ( rule__Space__Group__1__Impl )
            // InternalMyDsl.g:1758:2: rule__Space__Group__1__Impl
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
    // InternalMyDsl.g:1764:1: rule__Space__Group__1__Impl : ( ( rule__Space__SpaceAssignment_1 ) ) ;
    public final void rule__Space__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1768:1: ( ( ( rule__Space__SpaceAssignment_1 ) ) )
            // InternalMyDsl.g:1769:1: ( ( rule__Space__SpaceAssignment_1 ) )
            {
            // InternalMyDsl.g:1769:1: ( ( rule__Space__SpaceAssignment_1 ) )
            // InternalMyDsl.g:1770:2: ( rule__Space__SpaceAssignment_1 )
            {
             before(grammarAccess.getSpaceAccess().getSpaceAssignment_1()); 
            // InternalMyDsl.g:1771:2: ( rule__Space__SpaceAssignment_1 )
            // InternalMyDsl.g:1771:3: rule__Space__SpaceAssignment_1
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
    // InternalMyDsl.g:1780:1: rule__PositionValue__Group__0 : rule__PositionValue__Group__0__Impl rule__PositionValue__Group__1 ;
    public final void rule__PositionValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1784:1: ( rule__PositionValue__Group__0__Impl rule__PositionValue__Group__1 )
            // InternalMyDsl.g:1785:2: rule__PositionValue__Group__0__Impl rule__PositionValue__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:1792:1: rule__PositionValue__Group__0__Impl : ( ( rule__PositionValue__PosXAssignment_0 ) ) ;
    public final void rule__PositionValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1796:1: ( ( ( rule__PositionValue__PosXAssignment_0 ) ) )
            // InternalMyDsl.g:1797:1: ( ( rule__PositionValue__PosXAssignment_0 ) )
            {
            // InternalMyDsl.g:1797:1: ( ( rule__PositionValue__PosXAssignment_0 ) )
            // InternalMyDsl.g:1798:2: ( rule__PositionValue__PosXAssignment_0 )
            {
             before(grammarAccess.getPositionValueAccess().getPosXAssignment_0()); 
            // InternalMyDsl.g:1799:2: ( rule__PositionValue__PosXAssignment_0 )
            // InternalMyDsl.g:1799:3: rule__PositionValue__PosXAssignment_0
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
    // InternalMyDsl.g:1807:1: rule__PositionValue__Group__1 : rule__PositionValue__Group__1__Impl rule__PositionValue__Group__2 ;
    public final void rule__PositionValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1811:1: ( rule__PositionValue__Group__1__Impl rule__PositionValue__Group__2 )
            // InternalMyDsl.g:1812:2: rule__PositionValue__Group__1__Impl rule__PositionValue__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:1819:1: rule__PositionValue__Group__1__Impl : ( ',' ) ;
    public final void rule__PositionValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1823:1: ( ( ',' ) )
            // InternalMyDsl.g:1824:1: ( ',' )
            {
            // InternalMyDsl.g:1824:1: ( ',' )
            // InternalMyDsl.g:1825:2: ','
            {
             before(grammarAccess.getPositionValueAccess().getCommaKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMyDsl.g:1834:1: rule__PositionValue__Group__2 : rule__PositionValue__Group__2__Impl ;
    public final void rule__PositionValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1838:1: ( rule__PositionValue__Group__2__Impl )
            // InternalMyDsl.g:1839:2: rule__PositionValue__Group__2__Impl
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
    // InternalMyDsl.g:1845:1: rule__PositionValue__Group__2__Impl : ( ( rule__PositionValue__PosYAssignment_2 ) ) ;
    public final void rule__PositionValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1849:1: ( ( ( rule__PositionValue__PosYAssignment_2 ) ) )
            // InternalMyDsl.g:1850:1: ( ( rule__PositionValue__PosYAssignment_2 ) )
            {
            // InternalMyDsl.g:1850:1: ( ( rule__PositionValue__PosYAssignment_2 ) )
            // InternalMyDsl.g:1851:2: ( rule__PositionValue__PosYAssignment_2 )
            {
             before(grammarAccess.getPositionValueAccess().getPosYAssignment_2()); 
            // InternalMyDsl.g:1852:2: ( rule__PositionValue__PosYAssignment_2 )
            // InternalMyDsl.g:1852:3: rule__PositionValue__PosYAssignment_2
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
    // InternalMyDsl.g:1861:1: rule__Size__Group__0 : rule__Size__Group__0__Impl rule__Size__Group__1 ;
    public final void rule__Size__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1865:1: ( rule__Size__Group__0__Impl rule__Size__Group__1 )
            // InternalMyDsl.g:1866:2: rule__Size__Group__0__Impl rule__Size__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:1873:1: rule__Size__Group__0__Impl : ( ( rule__Size__WidthAssignment_0 ) ) ;
    public final void rule__Size__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1877:1: ( ( ( rule__Size__WidthAssignment_0 ) ) )
            // InternalMyDsl.g:1878:1: ( ( rule__Size__WidthAssignment_0 ) )
            {
            // InternalMyDsl.g:1878:1: ( ( rule__Size__WidthAssignment_0 ) )
            // InternalMyDsl.g:1879:2: ( rule__Size__WidthAssignment_0 )
            {
             before(grammarAccess.getSizeAccess().getWidthAssignment_0()); 
            // InternalMyDsl.g:1880:2: ( rule__Size__WidthAssignment_0 )
            // InternalMyDsl.g:1880:3: rule__Size__WidthAssignment_0
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
    // InternalMyDsl.g:1888:1: rule__Size__Group__1 : rule__Size__Group__1__Impl rule__Size__Group__2 ;
    public final void rule__Size__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1892:1: ( rule__Size__Group__1__Impl rule__Size__Group__2 )
            // InternalMyDsl.g:1893:2: rule__Size__Group__1__Impl rule__Size__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:1900:1: rule__Size__Group__1__Impl : ( ',' ) ;
    public final void rule__Size__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1904:1: ( ( ',' ) )
            // InternalMyDsl.g:1905:1: ( ',' )
            {
            // InternalMyDsl.g:1905:1: ( ',' )
            // InternalMyDsl.g:1906:2: ','
            {
             before(grammarAccess.getSizeAccess().getCommaKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMyDsl.g:1915:1: rule__Size__Group__2 : rule__Size__Group__2__Impl ;
    public final void rule__Size__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1919:1: ( rule__Size__Group__2__Impl )
            // InternalMyDsl.g:1920:2: rule__Size__Group__2__Impl
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
    // InternalMyDsl.g:1926:1: rule__Size__Group__2__Impl : ( ( rule__Size__HeightAssignment_2 ) ) ;
    public final void rule__Size__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1930:1: ( ( ( rule__Size__HeightAssignment_2 ) ) )
            // InternalMyDsl.g:1931:1: ( ( rule__Size__HeightAssignment_2 ) )
            {
            // InternalMyDsl.g:1931:1: ( ( rule__Size__HeightAssignment_2 ) )
            // InternalMyDsl.g:1932:2: ( rule__Size__HeightAssignment_2 )
            {
             before(grammarAccess.getSizeAccess().getHeightAssignment_2()); 
            // InternalMyDsl.g:1933:2: ( rule__Size__HeightAssignment_2 )
            // InternalMyDsl.g:1933:3: rule__Size__HeightAssignment_2
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
    // InternalMyDsl.g:1942:1: rule__ContainerReference__Group__0 : rule__ContainerReference__Group__0__Impl rule__ContainerReference__Group__1 ;
    public final void rule__ContainerReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1946:1: ( rule__ContainerReference__Group__0__Impl rule__ContainerReference__Group__1 )
            // InternalMyDsl.g:1947:2: rule__ContainerReference__Group__0__Impl rule__ContainerReference__Group__1
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
    // InternalMyDsl.g:1954:1: rule__ContainerReference__Group__0__Impl : ( ( rule__ContainerReference__ReferenceNameAssignment_0 ) ) ;
    public final void rule__ContainerReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1958:1: ( ( ( rule__ContainerReference__ReferenceNameAssignment_0 ) ) )
            // InternalMyDsl.g:1959:1: ( ( rule__ContainerReference__ReferenceNameAssignment_0 ) )
            {
            // InternalMyDsl.g:1959:1: ( ( rule__ContainerReference__ReferenceNameAssignment_0 ) )
            // InternalMyDsl.g:1960:2: ( rule__ContainerReference__ReferenceNameAssignment_0 )
            {
             before(grammarAccess.getContainerReferenceAccess().getReferenceNameAssignment_0()); 
            // InternalMyDsl.g:1961:2: ( rule__ContainerReference__ReferenceNameAssignment_0 )
            // InternalMyDsl.g:1961:3: rule__ContainerReference__ReferenceNameAssignment_0
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
    // InternalMyDsl.g:1969:1: rule__ContainerReference__Group__1 : rule__ContainerReference__Group__1__Impl ;
    public final void rule__ContainerReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1973:1: ( rule__ContainerReference__Group__1__Impl )
            // InternalMyDsl.g:1974:2: rule__ContainerReference__Group__1__Impl
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
    // InternalMyDsl.g:1980:1: rule__ContainerReference__Group__1__Impl : ( ( rule__ContainerReference__NameAssignment_1 ) ) ;
    public final void rule__ContainerReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1984:1: ( ( ( rule__ContainerReference__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1985:1: ( ( rule__ContainerReference__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1985:1: ( ( rule__ContainerReference__NameAssignment_1 ) )
            // InternalMyDsl.g:1986:2: ( rule__ContainerReference__NameAssignment_1 )
            {
             before(grammarAccess.getContainerReferenceAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1987:2: ( rule__ContainerReference__NameAssignment_1 )
            // InternalMyDsl.g:1987:3: rule__ContainerReference__NameAssignment_1
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
    // InternalMyDsl.g:1996:1: rule__Textfield__Group__0 : rule__Textfield__Group__0__Impl rule__Textfield__Group__1 ;
    public final void rule__Textfield__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2000:1: ( rule__Textfield__Group__0__Impl rule__Textfield__Group__1 )
            // InternalMyDsl.g:2001:2: rule__Textfield__Group__0__Impl rule__Textfield__Group__1
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
    // InternalMyDsl.g:2008:1: rule__Textfield__Group__0__Impl : ( 'textfield' ) ;
    public final void rule__Textfield__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2012:1: ( ( 'textfield' ) )
            // InternalMyDsl.g:2013:1: ( 'textfield' )
            {
            // InternalMyDsl.g:2013:1: ( 'textfield' )
            // InternalMyDsl.g:2014:2: 'textfield'
            {
             before(grammarAccess.getTextfieldAccess().getTextfieldKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMyDsl.g:2023:1: rule__Textfield__Group__1 : rule__Textfield__Group__1__Impl rule__Textfield__Group__2 ;
    public final void rule__Textfield__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2027:1: ( rule__Textfield__Group__1__Impl rule__Textfield__Group__2 )
            // InternalMyDsl.g:2028:2: rule__Textfield__Group__1__Impl rule__Textfield__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:2035:1: rule__Textfield__Group__1__Impl : ( ( rule__Textfield__NameAssignment_1 ) ) ;
    public final void rule__Textfield__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2039:1: ( ( ( rule__Textfield__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2040:1: ( ( rule__Textfield__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2040:1: ( ( rule__Textfield__NameAssignment_1 ) )
            // InternalMyDsl.g:2041:2: ( rule__Textfield__NameAssignment_1 )
            {
             before(grammarAccess.getTextfieldAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2042:2: ( rule__Textfield__NameAssignment_1 )
            // InternalMyDsl.g:2042:3: rule__Textfield__NameAssignment_1
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
    // InternalMyDsl.g:2050:1: rule__Textfield__Group__2 : rule__Textfield__Group__2__Impl rule__Textfield__Group__3 ;
    public final void rule__Textfield__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2054:1: ( rule__Textfield__Group__2__Impl rule__Textfield__Group__3 )
            // InternalMyDsl.g:2055:2: rule__Textfield__Group__2__Impl rule__Textfield__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:2062:1: rule__Textfield__Group__2__Impl : ( ( rule__Textfield__SizeAssignment_2 )? ) ;
    public final void rule__Textfield__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2066:1: ( ( ( rule__Textfield__SizeAssignment_2 )? ) )
            // InternalMyDsl.g:2067:1: ( ( rule__Textfield__SizeAssignment_2 )? )
            {
            // InternalMyDsl.g:2067:1: ( ( rule__Textfield__SizeAssignment_2 )? )
            // InternalMyDsl.g:2068:2: ( rule__Textfield__SizeAssignment_2 )?
            {
             before(grammarAccess.getTextfieldAccess().getSizeAssignment_2()); 
            // InternalMyDsl.g:2069:2: ( rule__Textfield__SizeAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:2069:3: rule__Textfield__SizeAssignment_2
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
    // InternalMyDsl.g:2077:1: rule__Textfield__Group__3 : rule__Textfield__Group__3__Impl ;
    public final void rule__Textfield__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2081:1: ( rule__Textfield__Group__3__Impl )
            // InternalMyDsl.g:2082:2: rule__Textfield__Group__3__Impl
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
    // InternalMyDsl.g:2088:1: rule__Textfield__Group__3__Impl : ( ( rule__Textfield__TextAssignment_3 ) ) ;
    public final void rule__Textfield__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2092:1: ( ( ( rule__Textfield__TextAssignment_3 ) ) )
            // InternalMyDsl.g:2093:1: ( ( rule__Textfield__TextAssignment_3 ) )
            {
            // InternalMyDsl.g:2093:1: ( ( rule__Textfield__TextAssignment_3 ) )
            // InternalMyDsl.g:2094:2: ( rule__Textfield__TextAssignment_3 )
            {
             before(grammarAccess.getTextfieldAccess().getTextAssignment_3()); 
            // InternalMyDsl.g:2095:2: ( rule__Textfield__TextAssignment_3 )
            // InternalMyDsl.g:2095:3: rule__Textfield__TextAssignment_3
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
    // InternalMyDsl.g:2104:1: rule__Label__Group__0 : rule__Label__Group__0__Impl rule__Label__Group__1 ;
    public final void rule__Label__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2108:1: ( rule__Label__Group__0__Impl rule__Label__Group__1 )
            // InternalMyDsl.g:2109:2: rule__Label__Group__0__Impl rule__Label__Group__1
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
    // InternalMyDsl.g:2116:1: rule__Label__Group__0__Impl : ( 'label' ) ;
    public final void rule__Label__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2120:1: ( ( 'label' ) )
            // InternalMyDsl.g:2121:1: ( 'label' )
            {
            // InternalMyDsl.g:2121:1: ( 'label' )
            // InternalMyDsl.g:2122:2: 'label'
            {
             before(grammarAccess.getLabelAccess().getLabelKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:2131:1: rule__Label__Group__1 : rule__Label__Group__1__Impl rule__Label__Group__2 ;
    public final void rule__Label__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2135:1: ( rule__Label__Group__1__Impl rule__Label__Group__2 )
            // InternalMyDsl.g:2136:2: rule__Label__Group__1__Impl rule__Label__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:2143:1: rule__Label__Group__1__Impl : ( ( rule__Label__NameAssignment_1 ) ) ;
    public final void rule__Label__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2147:1: ( ( ( rule__Label__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2148:1: ( ( rule__Label__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2148:1: ( ( rule__Label__NameAssignment_1 ) )
            // InternalMyDsl.g:2149:2: ( rule__Label__NameAssignment_1 )
            {
             before(grammarAccess.getLabelAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2150:2: ( rule__Label__NameAssignment_1 )
            // InternalMyDsl.g:2150:3: rule__Label__NameAssignment_1
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
    // InternalMyDsl.g:2158:1: rule__Label__Group__2 : rule__Label__Group__2__Impl rule__Label__Group__3 ;
    public final void rule__Label__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2162:1: ( rule__Label__Group__2__Impl rule__Label__Group__3 )
            // InternalMyDsl.g:2163:2: rule__Label__Group__2__Impl rule__Label__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:2170:1: rule__Label__Group__2__Impl : ( ( rule__Label__SizeAssignment_2 )? ) ;
    public final void rule__Label__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2174:1: ( ( ( rule__Label__SizeAssignment_2 )? ) )
            // InternalMyDsl.g:2175:1: ( ( rule__Label__SizeAssignment_2 )? )
            {
            // InternalMyDsl.g:2175:1: ( ( rule__Label__SizeAssignment_2 )? )
            // InternalMyDsl.g:2176:2: ( rule__Label__SizeAssignment_2 )?
            {
             before(grammarAccess.getLabelAccess().getSizeAssignment_2()); 
            // InternalMyDsl.g:2177:2: ( rule__Label__SizeAssignment_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:2177:3: rule__Label__SizeAssignment_2
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
    // InternalMyDsl.g:2185:1: rule__Label__Group__3 : rule__Label__Group__3__Impl ;
    public final void rule__Label__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2189:1: ( rule__Label__Group__3__Impl )
            // InternalMyDsl.g:2190:2: rule__Label__Group__3__Impl
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
    // InternalMyDsl.g:2196:1: rule__Label__Group__3__Impl : ( ( rule__Label__TextAssignment_3 ) ) ;
    public final void rule__Label__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2200:1: ( ( ( rule__Label__TextAssignment_3 ) ) )
            // InternalMyDsl.g:2201:1: ( ( rule__Label__TextAssignment_3 ) )
            {
            // InternalMyDsl.g:2201:1: ( ( rule__Label__TextAssignment_3 ) )
            // InternalMyDsl.g:2202:2: ( rule__Label__TextAssignment_3 )
            {
             before(grammarAccess.getLabelAccess().getTextAssignment_3()); 
            // InternalMyDsl.g:2203:2: ( rule__Label__TextAssignment_3 )
            // InternalMyDsl.g:2203:3: rule__Label__TextAssignment_3
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
    // InternalMyDsl.g:2212:1: rule__Button__Group__0 : rule__Button__Group__0__Impl rule__Button__Group__1 ;
    public final void rule__Button__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2216:1: ( rule__Button__Group__0__Impl rule__Button__Group__1 )
            // InternalMyDsl.g:2217:2: rule__Button__Group__0__Impl rule__Button__Group__1
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
    // InternalMyDsl.g:2224:1: rule__Button__Group__0__Impl : ( 'button' ) ;
    public final void rule__Button__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2228:1: ( ( 'button' ) )
            // InternalMyDsl.g:2229:1: ( 'button' )
            {
            // InternalMyDsl.g:2229:1: ( 'button' )
            // InternalMyDsl.g:2230:2: 'button'
            {
             before(grammarAccess.getButtonAccess().getButtonKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyDsl.g:2239:1: rule__Button__Group__1 : rule__Button__Group__1__Impl rule__Button__Group__2 ;
    public final void rule__Button__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2243:1: ( rule__Button__Group__1__Impl rule__Button__Group__2 )
            // InternalMyDsl.g:2244:2: rule__Button__Group__1__Impl rule__Button__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:2251:1: rule__Button__Group__1__Impl : ( ( rule__Button__NameAssignment_1 ) ) ;
    public final void rule__Button__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2255:1: ( ( ( rule__Button__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2256:1: ( ( rule__Button__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2256:1: ( ( rule__Button__NameAssignment_1 ) )
            // InternalMyDsl.g:2257:2: ( rule__Button__NameAssignment_1 )
            {
             before(grammarAccess.getButtonAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2258:2: ( rule__Button__NameAssignment_1 )
            // InternalMyDsl.g:2258:3: rule__Button__NameAssignment_1
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
    // InternalMyDsl.g:2266:1: rule__Button__Group__2 : rule__Button__Group__2__Impl rule__Button__Group__3 ;
    public final void rule__Button__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2270:1: ( rule__Button__Group__2__Impl rule__Button__Group__3 )
            // InternalMyDsl.g:2271:2: rule__Button__Group__2__Impl rule__Button__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:2278:1: rule__Button__Group__2__Impl : ( ( rule__Button__SizeAssignment_2 )? ) ;
    public final void rule__Button__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2282:1: ( ( ( rule__Button__SizeAssignment_2 )? ) )
            // InternalMyDsl.g:2283:1: ( ( rule__Button__SizeAssignment_2 )? )
            {
            // InternalMyDsl.g:2283:1: ( ( rule__Button__SizeAssignment_2 )? )
            // InternalMyDsl.g:2284:2: ( rule__Button__SizeAssignment_2 )?
            {
             before(grammarAccess.getButtonAccess().getSizeAssignment_2()); 
            // InternalMyDsl.g:2285:2: ( rule__Button__SizeAssignment_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_INT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:2285:3: rule__Button__SizeAssignment_2
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
    // InternalMyDsl.g:2293:1: rule__Button__Group__3 : rule__Button__Group__3__Impl ;
    public final void rule__Button__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2297:1: ( rule__Button__Group__3__Impl )
            // InternalMyDsl.g:2298:2: rule__Button__Group__3__Impl
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
    // InternalMyDsl.g:2304:1: rule__Button__Group__3__Impl : ( ( rule__Button__TextAssignment_3 ) ) ;
    public final void rule__Button__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2308:1: ( ( ( rule__Button__TextAssignment_3 ) ) )
            // InternalMyDsl.g:2309:1: ( ( rule__Button__TextAssignment_3 ) )
            {
            // InternalMyDsl.g:2309:1: ( ( rule__Button__TextAssignment_3 ) )
            // InternalMyDsl.g:2310:2: ( rule__Button__TextAssignment_3 )
            {
             before(grammarAccess.getButtonAccess().getTextAssignment_3()); 
            // InternalMyDsl.g:2311:2: ( rule__Button__TextAssignment_3 )
            // InternalMyDsl.g:2311:3: rule__Button__TextAssignment_3
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
    // InternalMyDsl.g:2320:1: rule__Checkbox__Group__0 : rule__Checkbox__Group__0__Impl rule__Checkbox__Group__1 ;
    public final void rule__Checkbox__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2324:1: ( rule__Checkbox__Group__0__Impl rule__Checkbox__Group__1 )
            // InternalMyDsl.g:2325:2: rule__Checkbox__Group__0__Impl rule__Checkbox__Group__1
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
    // InternalMyDsl.g:2332:1: rule__Checkbox__Group__0__Impl : ( 'checkbox' ) ;
    public final void rule__Checkbox__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2336:1: ( ( 'checkbox' ) )
            // InternalMyDsl.g:2337:1: ( 'checkbox' )
            {
            // InternalMyDsl.g:2337:1: ( 'checkbox' )
            // InternalMyDsl.g:2338:2: 'checkbox'
            {
             before(grammarAccess.getCheckboxAccess().getCheckboxKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMyDsl.g:2347:1: rule__Checkbox__Group__1 : rule__Checkbox__Group__1__Impl rule__Checkbox__Group__2 ;
    public final void rule__Checkbox__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2351:1: ( rule__Checkbox__Group__1__Impl rule__Checkbox__Group__2 )
            // InternalMyDsl.g:2352:2: rule__Checkbox__Group__1__Impl rule__Checkbox__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:2359:1: rule__Checkbox__Group__1__Impl : ( ( rule__Checkbox__NameAssignment_1 ) ) ;
    public final void rule__Checkbox__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2363:1: ( ( ( rule__Checkbox__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2364:1: ( ( rule__Checkbox__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2364:1: ( ( rule__Checkbox__NameAssignment_1 ) )
            // InternalMyDsl.g:2365:2: ( rule__Checkbox__NameAssignment_1 )
            {
             before(grammarAccess.getCheckboxAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2366:2: ( rule__Checkbox__NameAssignment_1 )
            // InternalMyDsl.g:2366:3: rule__Checkbox__NameAssignment_1
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
    // InternalMyDsl.g:2374:1: rule__Checkbox__Group__2 : rule__Checkbox__Group__2__Impl rule__Checkbox__Group__3 ;
    public final void rule__Checkbox__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2378:1: ( rule__Checkbox__Group__2__Impl rule__Checkbox__Group__3 )
            // InternalMyDsl.g:2379:2: rule__Checkbox__Group__2__Impl rule__Checkbox__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:2386:1: rule__Checkbox__Group__2__Impl : ( ( rule__Checkbox__SizeAssignment_2 )? ) ;
    public final void rule__Checkbox__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2390:1: ( ( ( rule__Checkbox__SizeAssignment_2 )? ) )
            // InternalMyDsl.g:2391:1: ( ( rule__Checkbox__SizeAssignment_2 )? )
            {
            // InternalMyDsl.g:2391:1: ( ( rule__Checkbox__SizeAssignment_2 )? )
            // InternalMyDsl.g:2392:2: ( rule__Checkbox__SizeAssignment_2 )?
            {
             before(grammarAccess.getCheckboxAccess().getSizeAssignment_2()); 
            // InternalMyDsl.g:2393:2: ( rule__Checkbox__SizeAssignment_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_INT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:2393:3: rule__Checkbox__SizeAssignment_2
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
    // InternalMyDsl.g:2401:1: rule__Checkbox__Group__3 : rule__Checkbox__Group__3__Impl rule__Checkbox__Group__4 ;
    public final void rule__Checkbox__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2405:1: ( rule__Checkbox__Group__3__Impl rule__Checkbox__Group__4 )
            // InternalMyDsl.g:2406:2: rule__Checkbox__Group__3__Impl rule__Checkbox__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:2413:1: rule__Checkbox__Group__3__Impl : ( ( rule__Checkbox__CheckedAssignment_3 ) ) ;
    public final void rule__Checkbox__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2417:1: ( ( ( rule__Checkbox__CheckedAssignment_3 ) ) )
            // InternalMyDsl.g:2418:1: ( ( rule__Checkbox__CheckedAssignment_3 ) )
            {
            // InternalMyDsl.g:2418:1: ( ( rule__Checkbox__CheckedAssignment_3 ) )
            // InternalMyDsl.g:2419:2: ( rule__Checkbox__CheckedAssignment_3 )
            {
             before(grammarAccess.getCheckboxAccess().getCheckedAssignment_3()); 
            // InternalMyDsl.g:2420:2: ( rule__Checkbox__CheckedAssignment_3 )
            // InternalMyDsl.g:2420:3: rule__Checkbox__CheckedAssignment_3
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
    // InternalMyDsl.g:2428:1: rule__Checkbox__Group__4 : rule__Checkbox__Group__4__Impl ;
    public final void rule__Checkbox__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2432:1: ( rule__Checkbox__Group__4__Impl )
            // InternalMyDsl.g:2433:2: rule__Checkbox__Group__4__Impl
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
    // InternalMyDsl.g:2439:1: rule__Checkbox__Group__4__Impl : ( ( rule__Checkbox__TextAssignment_4 ) ) ;
    public final void rule__Checkbox__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2443:1: ( ( ( rule__Checkbox__TextAssignment_4 ) ) )
            // InternalMyDsl.g:2444:1: ( ( rule__Checkbox__TextAssignment_4 ) )
            {
            // InternalMyDsl.g:2444:1: ( ( rule__Checkbox__TextAssignment_4 ) )
            // InternalMyDsl.g:2445:2: ( rule__Checkbox__TextAssignment_4 )
            {
             before(grammarAccess.getCheckboxAccess().getTextAssignment_4()); 
            // InternalMyDsl.g:2446:2: ( rule__Checkbox__TextAssignment_4 )
            // InternalMyDsl.g:2446:3: rule__Checkbox__TextAssignment_4
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
    // InternalMyDsl.g:2455:1: rule__Radiobutton__Group__0 : rule__Radiobutton__Group__0__Impl rule__Radiobutton__Group__1 ;
    public final void rule__Radiobutton__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2459:1: ( rule__Radiobutton__Group__0__Impl rule__Radiobutton__Group__1 )
            // InternalMyDsl.g:2460:2: rule__Radiobutton__Group__0__Impl rule__Radiobutton__Group__1
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
    // InternalMyDsl.g:2467:1: rule__Radiobutton__Group__0__Impl : ( 'radio' ) ;
    public final void rule__Radiobutton__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2471:1: ( ( 'radio' ) )
            // InternalMyDsl.g:2472:1: ( 'radio' )
            {
            // InternalMyDsl.g:2472:1: ( 'radio' )
            // InternalMyDsl.g:2473:2: 'radio'
            {
             before(grammarAccess.getRadiobuttonAccess().getRadioKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMyDsl.g:2482:1: rule__Radiobutton__Group__1 : rule__Radiobutton__Group__1__Impl rule__Radiobutton__Group__2 ;
    public final void rule__Radiobutton__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2486:1: ( rule__Radiobutton__Group__1__Impl rule__Radiobutton__Group__2 )
            // InternalMyDsl.g:2487:2: rule__Radiobutton__Group__1__Impl rule__Radiobutton__Group__2
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
    // InternalMyDsl.g:2494:1: rule__Radiobutton__Group__1__Impl : ( ( rule__Radiobutton__GroupAssignment_1 ) ) ;
    public final void rule__Radiobutton__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2498:1: ( ( ( rule__Radiobutton__GroupAssignment_1 ) ) )
            // InternalMyDsl.g:2499:1: ( ( rule__Radiobutton__GroupAssignment_1 ) )
            {
            // InternalMyDsl.g:2499:1: ( ( rule__Radiobutton__GroupAssignment_1 ) )
            // InternalMyDsl.g:2500:2: ( rule__Radiobutton__GroupAssignment_1 )
            {
             before(grammarAccess.getRadiobuttonAccess().getGroupAssignment_1()); 
            // InternalMyDsl.g:2501:2: ( rule__Radiobutton__GroupAssignment_1 )
            // InternalMyDsl.g:2501:3: rule__Radiobutton__GroupAssignment_1
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
    // InternalMyDsl.g:2509:1: rule__Radiobutton__Group__2 : rule__Radiobutton__Group__2__Impl rule__Radiobutton__Group__3 ;
    public final void rule__Radiobutton__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2513:1: ( rule__Radiobutton__Group__2__Impl rule__Radiobutton__Group__3 )
            // InternalMyDsl.g:2514:2: rule__Radiobutton__Group__2__Impl rule__Radiobutton__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:2521:1: rule__Radiobutton__Group__2__Impl : ( ( rule__Radiobutton__NameAssignment_2 ) ) ;
    public final void rule__Radiobutton__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2525:1: ( ( ( rule__Radiobutton__NameAssignment_2 ) ) )
            // InternalMyDsl.g:2526:1: ( ( rule__Radiobutton__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:2526:1: ( ( rule__Radiobutton__NameAssignment_2 ) )
            // InternalMyDsl.g:2527:2: ( rule__Radiobutton__NameAssignment_2 )
            {
             before(grammarAccess.getRadiobuttonAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:2528:2: ( rule__Radiobutton__NameAssignment_2 )
            // InternalMyDsl.g:2528:3: rule__Radiobutton__NameAssignment_2
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
    // InternalMyDsl.g:2536:1: rule__Radiobutton__Group__3 : rule__Radiobutton__Group__3__Impl rule__Radiobutton__Group__4 ;
    public final void rule__Radiobutton__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2540:1: ( rule__Radiobutton__Group__3__Impl rule__Radiobutton__Group__4 )
            // InternalMyDsl.g:2541:2: rule__Radiobutton__Group__3__Impl rule__Radiobutton__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:2548:1: rule__Radiobutton__Group__3__Impl : ( ( rule__Radiobutton__SizeAssignment_3 )? ) ;
    public final void rule__Radiobutton__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2552:1: ( ( ( rule__Radiobutton__SizeAssignment_3 )? ) )
            // InternalMyDsl.g:2553:1: ( ( rule__Radiobutton__SizeAssignment_3 )? )
            {
            // InternalMyDsl.g:2553:1: ( ( rule__Radiobutton__SizeAssignment_3 )? )
            // InternalMyDsl.g:2554:2: ( rule__Radiobutton__SizeAssignment_3 )?
            {
             before(grammarAccess.getRadiobuttonAccess().getSizeAssignment_3()); 
            // InternalMyDsl.g:2555:2: ( rule__Radiobutton__SizeAssignment_3 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INT) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:2555:3: rule__Radiobutton__SizeAssignment_3
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
    // InternalMyDsl.g:2563:1: rule__Radiobutton__Group__4 : rule__Radiobutton__Group__4__Impl rule__Radiobutton__Group__5 ;
    public final void rule__Radiobutton__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2567:1: ( rule__Radiobutton__Group__4__Impl rule__Radiobutton__Group__5 )
            // InternalMyDsl.g:2568:2: rule__Radiobutton__Group__4__Impl rule__Radiobutton__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:2575:1: rule__Radiobutton__Group__4__Impl : ( ( rule__Radiobutton__CheckedAssignment_4 )? ) ;
    public final void rule__Radiobutton__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2579:1: ( ( ( rule__Radiobutton__CheckedAssignment_4 )? ) )
            // InternalMyDsl.g:2580:1: ( ( rule__Radiobutton__CheckedAssignment_4 )? )
            {
            // InternalMyDsl.g:2580:1: ( ( rule__Radiobutton__CheckedAssignment_4 )? )
            // InternalMyDsl.g:2581:2: ( rule__Radiobutton__CheckedAssignment_4 )?
            {
             before(grammarAccess.getRadiobuttonAccess().getCheckedAssignment_4()); 
            // InternalMyDsl.g:2582:2: ( rule__Radiobutton__CheckedAssignment_4 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==11) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:2582:3: rule__Radiobutton__CheckedAssignment_4
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
    // InternalMyDsl.g:2590:1: rule__Radiobutton__Group__5 : rule__Radiobutton__Group__5__Impl ;
    public final void rule__Radiobutton__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2594:1: ( rule__Radiobutton__Group__5__Impl )
            // InternalMyDsl.g:2595:2: rule__Radiobutton__Group__5__Impl
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
    // InternalMyDsl.g:2601:1: rule__Radiobutton__Group__5__Impl : ( ( rule__Radiobutton__TextAssignment_5 ) ) ;
    public final void rule__Radiobutton__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2605:1: ( ( ( rule__Radiobutton__TextAssignment_5 ) ) )
            // InternalMyDsl.g:2606:1: ( ( rule__Radiobutton__TextAssignment_5 ) )
            {
            // InternalMyDsl.g:2606:1: ( ( rule__Radiobutton__TextAssignment_5 ) )
            // InternalMyDsl.g:2607:2: ( rule__Radiobutton__TextAssignment_5 )
            {
             before(grammarAccess.getRadiobuttonAccess().getTextAssignment_5()); 
            // InternalMyDsl.g:2608:2: ( rule__Radiobutton__TextAssignment_5 )
            // InternalMyDsl.g:2608:3: rule__Radiobutton__TextAssignment_5
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
    // InternalMyDsl.g:2617:1: rule__Domainmodel__MainAssignment_1 : ( ruleNAME ) ;
    public final void rule__Domainmodel__MainAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2621:1: ( ( ruleNAME ) )
            // InternalMyDsl.g:2622:2: ( ruleNAME )
            {
            // InternalMyDsl.g:2622:2: ( ruleNAME )
            // InternalMyDsl.g:2623:3: ruleNAME
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
    // InternalMyDsl.g:2632:1: rule__Domainmodel__ElementsAssignment_2 : ( ruleType ) ;
    public final void rule__Domainmodel__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2636:1: ( ( ruleType ) )
            // InternalMyDsl.g:2637:2: ( ruleType )
            {
            // InternalMyDsl.g:2637:2: ( ruleType )
            // InternalMyDsl.g:2638:3: ruleType
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
    // InternalMyDsl.g:2647:1: rule__Frame__NameAssignment_1 : ( ruleNAME ) ;
    public final void rule__Frame__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2651:1: ( ( ruleNAME ) )
            // InternalMyDsl.g:2652:2: ( ruleNAME )
            {
            // InternalMyDsl.g:2652:2: ( ruleNAME )
            // InternalMyDsl.g:2653:3: ruleNAME
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
    // InternalMyDsl.g:2662:1: rule__Frame__SizeAssignment_2 : ( ruleSize ) ;
    public final void rule__Frame__SizeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2666:1: ( ( ruleSize ) )
            // InternalMyDsl.g:2667:2: ( ruleSize )
            {
            // InternalMyDsl.g:2667:2: ( ruleSize )
            // InternalMyDsl.g:2668:3: ruleSize
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
    // InternalMyDsl.g:2677:1: rule__Frame__LayoutAssignment_3 : ( ruleLayout ) ;
    public final void rule__Frame__LayoutAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2681:1: ( ( ruleLayout ) )
            // InternalMyDsl.g:2682:2: ( ruleLayout )
            {
            // InternalMyDsl.g:2682:2: ( ruleLayout )
            // InternalMyDsl.g:2683:3: ruleLayout
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
    // InternalMyDsl.g:2692:1: rule__Container__NameAssignment_1 : ( ruleNAME ) ;
    public final void rule__Container__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2696:1: ( ( ruleNAME ) )
            // InternalMyDsl.g:2697:2: ( ruleNAME )
            {
            // InternalMyDsl.g:2697:2: ( ruleNAME )
            // InternalMyDsl.g:2698:3: ruleNAME
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
    // InternalMyDsl.g:2707:1: rule__Container__SizeAssignment_2 : ( ruleSize ) ;
    public final void rule__Container__SizeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2711:1: ( ( ruleSize ) )
            // InternalMyDsl.g:2712:2: ( ruleSize )
            {
            // InternalMyDsl.g:2712:2: ( ruleSize )
            // InternalMyDsl.g:2713:3: ruleSize
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
    // InternalMyDsl.g:2722:1: rule__Container__LayoutAssignment_3 : ( ruleLayout ) ;
    public final void rule__Container__LayoutAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2726:1: ( ( ruleLayout ) )
            // InternalMyDsl.g:2727:2: ( ruleLayout )
            {
            // InternalMyDsl.g:2727:2: ( ruleLayout )
            // InternalMyDsl.g:2728:3: ruleLayout
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


    // $ANTLR start "rule__LayoutHorizontal__FixedAssignment_1"
    // InternalMyDsl.g:2737:1: rule__LayoutHorizontal__FixedAssignment_1 : ( ruleFixed ) ;
    public final void rule__LayoutHorizontal__FixedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2741:1: ( ( ruleFixed ) )
            // InternalMyDsl.g:2742:2: ( ruleFixed )
            {
            // InternalMyDsl.g:2742:2: ( ruleFixed )
            // InternalMyDsl.g:2743:3: ruleFixed
            {
             before(grammarAccess.getLayoutHorizontalAccess().getFixedFixedParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFixed();

            state._fsp--;

             after(grammarAccess.getLayoutHorizontalAccess().getFixedFixedParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__LayoutHorizontal__FixedAssignment_1"


    // $ANTLR start "rule__LayoutHorizontal__EntriesAssignment_3"
    // InternalMyDsl.g:2752:1: rule__LayoutHorizontal__EntriesAssignment_3 : ( ruleLayoutHorizontalEntry ) ;
    public final void rule__LayoutHorizontal__EntriesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2756:1: ( ( ruleLayoutHorizontalEntry ) )
            // InternalMyDsl.g:2757:2: ( ruleLayoutHorizontalEntry )
            {
            // InternalMyDsl.g:2757:2: ( ruleLayoutHorizontalEntry )
            // InternalMyDsl.g:2758:3: ruleLayoutHorizontalEntry
            {
             before(grammarAccess.getLayoutHorizontalAccess().getEntriesLayoutHorizontalEntryParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLayoutHorizontalEntry();

            state._fsp--;

             after(grammarAccess.getLayoutHorizontalAccess().getEntriesLayoutHorizontalEntryParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__LayoutHorizontal__EntriesAssignment_3"


    // $ANTLR start "rule__LayoutHorizontalEntry__SpaceAssignment_0"
    // InternalMyDsl.g:2767:1: rule__LayoutHorizontalEntry__SpaceAssignment_0 : ( ruleSpace ) ;
    public final void rule__LayoutHorizontalEntry__SpaceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2771:1: ( ( ruleSpace ) )
            // InternalMyDsl.g:2772:2: ( ruleSpace )
            {
            // InternalMyDsl.g:2772:2: ( ruleSpace )
            // InternalMyDsl.g:2773:3: ruleSpace
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
    // InternalMyDsl.g:2782:1: rule__LayoutHorizontalEntry__GuielementAssignment_1 : ( ruleGuiElement ) ;
    public final void rule__LayoutHorizontalEntry__GuielementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2786:1: ( ( ruleGuiElement ) )
            // InternalMyDsl.g:2787:2: ( ruleGuiElement )
            {
            // InternalMyDsl.g:2787:2: ( ruleGuiElement )
            // InternalMyDsl.g:2788:3: ruleGuiElement
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


    // $ANTLR start "rule__LayoutVertical__FixedAssignment_1"
    // InternalMyDsl.g:2797:1: rule__LayoutVertical__FixedAssignment_1 : ( ruleFixed ) ;
    public final void rule__LayoutVertical__FixedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2801:1: ( ( ruleFixed ) )
            // InternalMyDsl.g:2802:2: ( ruleFixed )
            {
            // InternalMyDsl.g:2802:2: ( ruleFixed )
            // InternalMyDsl.g:2803:3: ruleFixed
            {
             before(grammarAccess.getLayoutVerticalAccess().getFixedFixedParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFixed();

            state._fsp--;

             after(grammarAccess.getLayoutVerticalAccess().getFixedFixedParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__LayoutVertical__FixedAssignment_1"


    // $ANTLR start "rule__LayoutVertical__EntriesAssignment_3"
    // InternalMyDsl.g:2812:1: rule__LayoutVertical__EntriesAssignment_3 : ( ruleLayoutVerticalEntry ) ;
    public final void rule__LayoutVertical__EntriesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2816:1: ( ( ruleLayoutVerticalEntry ) )
            // InternalMyDsl.g:2817:2: ( ruleLayoutVerticalEntry )
            {
            // InternalMyDsl.g:2817:2: ( ruleLayoutVerticalEntry )
            // InternalMyDsl.g:2818:3: ruleLayoutVerticalEntry
            {
             before(grammarAccess.getLayoutVerticalAccess().getEntriesLayoutVerticalEntryParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLayoutVerticalEntry();

            state._fsp--;

             after(grammarAccess.getLayoutVerticalAccess().getEntriesLayoutVerticalEntryParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__LayoutVertical__EntriesAssignment_3"


    // $ANTLR start "rule__LayoutVerticalEntry__SpaceAssignment_0"
    // InternalMyDsl.g:2827:1: rule__LayoutVerticalEntry__SpaceAssignment_0 : ( ruleSpace ) ;
    public final void rule__LayoutVerticalEntry__SpaceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2831:1: ( ( ruleSpace ) )
            // InternalMyDsl.g:2832:2: ( ruleSpace )
            {
            // InternalMyDsl.g:2832:2: ( ruleSpace )
            // InternalMyDsl.g:2833:3: ruleSpace
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
    // InternalMyDsl.g:2842:1: rule__LayoutVerticalEntry__GuielementAssignment_1 : ( ruleGuiElement ) ;
    public final void rule__LayoutVerticalEntry__GuielementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2846:1: ( ( ruleGuiElement ) )
            // InternalMyDsl.g:2847:2: ( ruleGuiElement )
            {
            // InternalMyDsl.g:2847:2: ( ruleGuiElement )
            // InternalMyDsl.g:2848:3: ruleGuiElement
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
    // InternalMyDsl.g:2857:1: rule__LayoutPosition__EntriesAssignment_2 : ( ruleLayoutPositionEntry ) ;
    public final void rule__LayoutPosition__EntriesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2861:1: ( ( ruleLayoutPositionEntry ) )
            // InternalMyDsl.g:2862:2: ( ruleLayoutPositionEntry )
            {
            // InternalMyDsl.g:2862:2: ( ruleLayoutPositionEntry )
            // InternalMyDsl.g:2863:3: ruleLayoutPositionEntry
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
    // InternalMyDsl.g:2872:1: rule__LayoutPositionEntry__PositionAssignment_1 : ( rulePositionValue ) ;
    public final void rule__LayoutPositionEntry__PositionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2876:1: ( ( rulePositionValue ) )
            // InternalMyDsl.g:2877:2: ( rulePositionValue )
            {
            // InternalMyDsl.g:2877:2: ( rulePositionValue )
            // InternalMyDsl.g:2878:3: rulePositionValue
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
    // InternalMyDsl.g:2887:1: rule__LayoutPositionEntry__GuielementAssignment_3 : ( ruleGuiElement ) ;
    public final void rule__LayoutPositionEntry__GuielementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2891:1: ( ( ruleGuiElement ) )
            // InternalMyDsl.g:2892:2: ( ruleGuiElement )
            {
            // InternalMyDsl.g:2892:2: ( ruleGuiElement )
            // InternalMyDsl.g:2893:3: ruleGuiElement
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


    // $ANTLR start "rule__Fixed__FixedAssignment_1"
    // InternalMyDsl.g:2902:1: rule__Fixed__FixedAssignment_1 : ( RULE_INT ) ;
    public final void rule__Fixed__FixedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2906:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2907:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2907:2: ( RULE_INT )
            // InternalMyDsl.g:2908:3: RULE_INT
            {
             before(grammarAccess.getFixedAccess().getFixedINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFixedAccess().getFixedINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Fixed__FixedAssignment_1"


    // $ANTLR start "rule__Space__SpaceAssignment_1"
    // InternalMyDsl.g:2917:1: rule__Space__SpaceAssignment_1 : ( RULE_INT ) ;
    public final void rule__Space__SpaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2921:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2922:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2922:2: ( RULE_INT )
            // InternalMyDsl.g:2923:3: RULE_INT
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
    // InternalMyDsl.g:2932:1: rule__PositionValue__PosXAssignment_0 : ( RULE_INT ) ;
    public final void rule__PositionValue__PosXAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2936:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2937:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2937:2: ( RULE_INT )
            // InternalMyDsl.g:2938:3: RULE_INT
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
    // InternalMyDsl.g:2947:1: rule__PositionValue__PosYAssignment_2 : ( RULE_INT ) ;
    public final void rule__PositionValue__PosYAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2951:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2952:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2952:2: ( RULE_INT )
            // InternalMyDsl.g:2953:3: RULE_INT
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
    // InternalMyDsl.g:2962:1: rule__Size__WidthAssignment_0 : ( RULE_INT ) ;
    public final void rule__Size__WidthAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2966:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2967:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2967:2: ( RULE_INT )
            // InternalMyDsl.g:2968:3: RULE_INT
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
    // InternalMyDsl.g:2977:1: rule__Size__HeightAssignment_2 : ( RULE_INT ) ;
    public final void rule__Size__HeightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2981:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2982:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2982:2: ( RULE_INT )
            // InternalMyDsl.g:2983:3: RULE_INT
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
    // InternalMyDsl.g:2992:1: rule__ContainerReference__ReferenceNameAssignment_0 : ( ruleNAME ) ;
    public final void rule__ContainerReference__ReferenceNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2996:1: ( ( ruleNAME ) )
            // InternalMyDsl.g:2997:2: ( ruleNAME )
            {
            // InternalMyDsl.g:2997:2: ( ruleNAME )
            // InternalMyDsl.g:2998:3: ruleNAME
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
    // InternalMyDsl.g:3007:1: rule__ContainerReference__NameAssignment_1 : ( ruleNAME ) ;
    public final void rule__ContainerReference__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3011:1: ( ( ruleNAME ) )
            // InternalMyDsl.g:3012:2: ( ruleNAME )
            {
            // InternalMyDsl.g:3012:2: ( ruleNAME )
            // InternalMyDsl.g:3013:3: ruleNAME
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
    // InternalMyDsl.g:3022:1: rule__Text__TextAssignment : ( RULE_STRING ) ;
    public final void rule__Text__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3026:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3027:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3027:2: ( RULE_STRING )
            // InternalMyDsl.g:3028:3: RULE_STRING
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
    // InternalMyDsl.g:3037:1: rule__Textfield__NameAssignment_1 : ( ruleNAME ) ;
    public final void rule__Textfield__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3041:1: ( ( ruleNAME ) )
            // InternalMyDsl.g:3042:2: ( ruleNAME )
            {
            // InternalMyDsl.g:3042:2: ( ruleNAME )
            // InternalMyDsl.g:3043:3: ruleNAME
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
    // InternalMyDsl.g:3052:1: rule__Textfield__SizeAssignment_2 : ( ruleSize ) ;
    public final void rule__Textfield__SizeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3056:1: ( ( ruleSize ) )
            // InternalMyDsl.g:3057:2: ( ruleSize )
            {
            // InternalMyDsl.g:3057:2: ( ruleSize )
            // InternalMyDsl.g:3058:3: ruleSize
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
    // InternalMyDsl.g:3067:1: rule__Textfield__TextAssignment_3 : ( ruleText ) ;
    public final void rule__Textfield__TextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3071:1: ( ( ruleText ) )
            // InternalMyDsl.g:3072:2: ( ruleText )
            {
            // InternalMyDsl.g:3072:2: ( ruleText )
            // InternalMyDsl.g:3073:3: ruleText
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
    // InternalMyDsl.g:3082:1: rule__Label__NameAssignment_1 : ( ruleNAME ) ;
    public final void rule__Label__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3086:1: ( ( ruleNAME ) )
            // InternalMyDsl.g:3087:2: ( ruleNAME )
            {
            // InternalMyDsl.g:3087:2: ( ruleNAME )
            // InternalMyDsl.g:3088:3: ruleNAME
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
    // InternalMyDsl.g:3097:1: rule__Label__SizeAssignment_2 : ( ruleSize ) ;
    public final void rule__Label__SizeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3101:1: ( ( ruleSize ) )
            // InternalMyDsl.g:3102:2: ( ruleSize )
            {
            // InternalMyDsl.g:3102:2: ( ruleSize )
            // InternalMyDsl.g:3103:3: ruleSize
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
    // InternalMyDsl.g:3112:1: rule__Label__TextAssignment_3 : ( ruleText ) ;
    public final void rule__Label__TextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3116:1: ( ( ruleText ) )
            // InternalMyDsl.g:3117:2: ( ruleText )
            {
            // InternalMyDsl.g:3117:2: ( ruleText )
            // InternalMyDsl.g:3118:3: ruleText
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
    // InternalMyDsl.g:3127:1: rule__Button__NameAssignment_1 : ( ruleNAME ) ;
    public final void rule__Button__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3131:1: ( ( ruleNAME ) )
            // InternalMyDsl.g:3132:2: ( ruleNAME )
            {
            // InternalMyDsl.g:3132:2: ( ruleNAME )
            // InternalMyDsl.g:3133:3: ruleNAME
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
    // InternalMyDsl.g:3142:1: rule__Button__SizeAssignment_2 : ( ruleSize ) ;
    public final void rule__Button__SizeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3146:1: ( ( ruleSize ) )
            // InternalMyDsl.g:3147:2: ( ruleSize )
            {
            // InternalMyDsl.g:3147:2: ( ruleSize )
            // InternalMyDsl.g:3148:3: ruleSize
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
    // InternalMyDsl.g:3157:1: rule__Button__TextAssignment_3 : ( ruleText ) ;
    public final void rule__Button__TextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3161:1: ( ( ruleText ) )
            // InternalMyDsl.g:3162:2: ( ruleText )
            {
            // InternalMyDsl.g:3162:2: ( ruleText )
            // InternalMyDsl.g:3163:3: ruleText
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
    // InternalMyDsl.g:3172:1: rule__Checkbox__NameAssignment_1 : ( ruleNAME ) ;
    public final void rule__Checkbox__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3176:1: ( ( ruleNAME ) )
            // InternalMyDsl.g:3177:2: ( ruleNAME )
            {
            // InternalMyDsl.g:3177:2: ( ruleNAME )
            // InternalMyDsl.g:3178:3: ruleNAME
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
    // InternalMyDsl.g:3187:1: rule__Checkbox__SizeAssignment_2 : ( ruleSize ) ;
    public final void rule__Checkbox__SizeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3191:1: ( ( ruleSize ) )
            // InternalMyDsl.g:3192:2: ( ruleSize )
            {
            // InternalMyDsl.g:3192:2: ( ruleSize )
            // InternalMyDsl.g:3193:3: ruleSize
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
    // InternalMyDsl.g:3202:1: rule__Checkbox__CheckedAssignment_3 : ( ruleCHECKED ) ;
    public final void rule__Checkbox__CheckedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3206:1: ( ( ruleCHECKED ) )
            // InternalMyDsl.g:3207:2: ( ruleCHECKED )
            {
            // InternalMyDsl.g:3207:2: ( ruleCHECKED )
            // InternalMyDsl.g:3208:3: ruleCHECKED
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
    // InternalMyDsl.g:3217:1: rule__Checkbox__TextAssignment_4 : ( ruleText ) ;
    public final void rule__Checkbox__TextAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3221:1: ( ( ruleText ) )
            // InternalMyDsl.g:3222:2: ( ruleText )
            {
            // InternalMyDsl.g:3222:2: ( ruleText )
            // InternalMyDsl.g:3223:3: ruleText
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
    // InternalMyDsl.g:3232:1: rule__Radiobutton__GroupAssignment_1 : ( ruleNAME ) ;
    public final void rule__Radiobutton__GroupAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3236:1: ( ( ruleNAME ) )
            // InternalMyDsl.g:3237:2: ( ruleNAME )
            {
            // InternalMyDsl.g:3237:2: ( ruleNAME )
            // InternalMyDsl.g:3238:3: ruleNAME
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
    // InternalMyDsl.g:3247:1: rule__Radiobutton__NameAssignment_2 : ( ruleNAME ) ;
    public final void rule__Radiobutton__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3251:1: ( ( ruleNAME ) )
            // InternalMyDsl.g:3252:2: ( ruleNAME )
            {
            // InternalMyDsl.g:3252:2: ( ruleNAME )
            // InternalMyDsl.g:3253:3: ruleNAME
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
    // InternalMyDsl.g:3262:1: rule__Radiobutton__SizeAssignment_3 : ( ruleSize ) ;
    public final void rule__Radiobutton__SizeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3266:1: ( ( ruleSize ) )
            // InternalMyDsl.g:3267:2: ( ruleSize )
            {
            // InternalMyDsl.g:3267:2: ( ruleSize )
            // InternalMyDsl.g:3268:3: ruleSize
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
    // InternalMyDsl.g:3277:1: rule__Radiobutton__CheckedAssignment_4 : ( ruleCHECKED_YES ) ;
    public final void rule__Radiobutton__CheckedAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3281:1: ( ( ruleCHECKED_YES ) )
            // InternalMyDsl.g:3282:2: ( ruleCHECKED_YES )
            {
            // InternalMyDsl.g:3282:2: ( ruleCHECKED_YES )
            // InternalMyDsl.g:3283:3: ruleCHECKED_YES
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
    // InternalMyDsl.g:3292:1: rule__Radiobutton__TextAssignment_5 : ( ruleText ) ;
    public final void rule__Radiobutton__TextAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3296:1: ( ( ruleText ) )
            // InternalMyDsl.g:3297:2: ( ruleText )
            {
            // InternalMyDsl.g:3297:2: ( ruleText )
            // InternalMyDsl.g:3298:3: ruleText
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
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000820000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000007D1D0010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000007D190012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000007D190010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000001820L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000860L});

}